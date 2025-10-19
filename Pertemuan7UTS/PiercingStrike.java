package Pertemuan7UTS;


public class PiercingStrike implements Skill {
    private double multiplier;

    public PiercingStrike(double multiplier) { this.multiplier = multiplier; }

    @Override
    public String name() { return "PiercingStrike(x" + multiplier + ")"; }

    @Override
    public void onTurnStart(Character self) {
    }

    @Override
    public boolean isAttackModifier() { return true; }

    @Override
    public void onAttack(Character self, Character target, int baseDamage) {
        int finalDamage = (int) Math.round(baseDamage * this.multiplier);
        
        System.out.println("[Team A] " + self.getName() + " -> " + target.getName() + " (" + name() + "): " + finalDamage + " dmg");
        target.takeDamage(finalDamage);
        self.totalDamageDealt += finalDamage;
    }
    
    @Override
    public String toString() { return name(); }
}
