package Pertemuan8UTS;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    
    public final List<StatusEffect> effects = new ArrayList<>();

    public int totalDamageDealt = 0;
    public int totalDamageTaken = 0;
    public int totalDamageShielded = 0;
    public int totalHealing = 0;

    protected Character(String name, int health, int attackPower) {
        if (health < 0) {
            System.out.println("[WARNING] Input health untuk " + name + " tidak valid (" + health + "). Diatur ke 1.");
            health = 1;
        }
        
        if (attackPower < 0) {
            System.out.println("[WARNING] Input attackPower untuk " + name + " tidak valid (" + attackPower + "). Diatur ke 0.");
            attackPower = 0;
        }
        
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }

    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }
    public final int getMaxHealth() { return maxHealth; }
    public final boolean isAlive() { return health > 0; }
    public String getStatRingkas() { return ""; }

    public int getLevel() { return 0; }
    
    public int getThreatLevel() { return 0; }

    public abstract String getStatus();
    public String getSkillLog() { return ""; }

    public String getEffectLog() { return effects.toString(); }


    protected final void setHealth(int value) {
        this.health = Math.max(0, Math.min(value, this.maxHealth));
    }

    public final void heal(int amount) {
        int oldHealth = this.health;
        setHealth(this.health + amount);
        this.totalHealing += (this.health - oldHealth);
    }

    public final void addEffect(StatusEffect e) {
        if (e != null) effects.add(e);
    }
    
    protected int onIncomingDamage(int base) {
        int modifiedDamage = base;
        for (StatusEffect effect : effects) {
            if (!effect.isExpired()) {
                int oldModifiedDamage = modifiedDamage;
                
                modifiedDamage = effect.onDamageTaken(modifiedDamage);

                this.totalDamageShielded += (oldModifiedDamage - modifiedDamage);
            }
        }
        return modifiedDamage;
    }

    public final void takeDamage(int dmg) {
        System.out.print(getName() + " (Normal " + dmg);
        
        int actualDamage = onIncomingDamage(Math.max(0, dmg));
        
        System.out.println("): " + actualDamage + " dmg");
        
        int oldHealth = this.health;
        setHealth(this.health - actualDamage);
        this.totalDamageTaken += actualDamage;
        
        System.out.println(getName() + " HP: " + oldHealth + " -> " + this.health);
    }

    public final void performTurn(Character target) {
        if (!isAlive()) return;

        System.out.print("[Start Effects] " + getName() + ": ");
        for (StatusEffect effect : effects) {
            if (!effect.isExpired()) {
                System.out.print(effect.getStatusLog() + ", ");
                effect.onTurnStart(this);
            }
        }
        System.out.println();
        
        attack(target);

        System.out.print("[End Effects] " + getName() + " ");
        for (StatusEffect effect : effects) {
            if (!effect.isExpired()) {
                effect.onTurnEnd(this);
            }
        }
        System.out.println();

        effects.removeIf(effect -> {
            if (effect.isExpired()) {
                if (effect.getClass().getSimpleName().equals("Shield")) {
                    System.out.println("[End Effects] " + getName() + " Shield EXPIRES");
                } else if (effect.getClass().getSimpleName().equals("Regen")) {
                     System.out.println("[End Effects] " + getName() + " Regen EXPIRES");
                }
                return true;
            } else {
                if (effect.getClass().getSimpleName().equals("Shield")) {
                     System.out.println("[End Effects] " + getName() + " Shield remaining: " + ((Shield)effect).duration + " turns");
                }
                return false;
            }
        });
    }

    public abstract void attack(Character target);
}