package Pertemuan7UTS;

import java.util.*;

public class Player extends Character {
    private int level;
    private AttackStrategy strategy;
    public final List<Skill> skills = new ArrayList<>();
    private Random rand = new Random();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        this.level = level;
        this.strategy = strategy;
    }

    public void addSkill(Skill s) {
        if (s != null) skills.add(s);
    }

    @Override
    public int getLevel() { 
        return this.level; 
    }

    @Override
    public String getStatus() {
        return String.format("Player(name=%s, HP=%d/%d, AP=%d, Lv=%d, Strategy=%s)",
                getName(), getHealth(), getMaxHealth(), getAttackPower(), 
                level, strategy.toString());
    }
    
    @Override
    public String getSkillLog() {
        return skills.toString();
    }

    @Override
    public void attack(Character target) {
        
        for (Skill s : skills) {
            s.onTurnStart(this);
        }

        int baseDamage = this.strategy.computeDamage(this, target);
        
        Skill attackMod = null;
        for (Skill s : skills) {
            if (s.isAttackModifier() && rand.nextBoolean()) {
                attackMod = s;
                break;
            }
        }

        if (attackMod != null) {
            attackMod.onAttack(this, target, baseDamage);
        } else {
            System.out.println("[Team A] " + getName() + " -> " + target.getName() + 
                               " (Normal Strategy): " + baseDamage + " dmg");
            target.takeDamage(baseDamage);
            totalDamageDealt += baseDamage;
        }
    }

    @Override
    public String getStatRingkas() {
        return String.format(
            "- Player total serangan: %d\n" +
            "- Shield menyerap total: %d dmg\n" +
            "- Regen memulihkan total: %d HP",
            this.totalDamageDealt,
            this.totalDamageShielded,
            this.totalHealing
        );
    }
}
