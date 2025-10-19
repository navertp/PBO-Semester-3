package Pertemuan7UTS;

public class HealSkill implements Skill {
    private int amount;

    public HealSkill(int amount) { this.amount = amount; }

    @Override
    public String name() { return "HealSkill(+" + amount + ")"; }

    @Override
    public void onTurnStart(Character self) {
        if (self.getHealth() <= (self.getMaxHealth() * 0.6)) { 
            System.out.println("[Team A] " + self.getName() + " uses " + name() +": " + self.getHealth() + " -> " + Math.min(self.getMaxHealth(), self.getHealth() + amount));
            self.heal(amount);
        }
    }

    @Override
    public boolean isAttackModifier() { return false; }

    @Override
    public void onAttack(Character self, Character target, int baseDamage) {
    }
    
    @Override
    public String toString() { return name(); }
}
