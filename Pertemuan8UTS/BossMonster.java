package Pertemuan8UTS;

public class BossMonster extends Enemy {
    private int turnCounter = 0;
    public int rageStrikesTriggered = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++;
        
        boolean healthRage = (getHealth() < (maxHealth * 0.5));
        boolean turnRage = (turnCounter % 3 == 0);
        boolean isRage = healthRage || turnRage;

        int baseDamage = strategy.computeDamage(this, target);
        int finalDamage = baseDamage;

        System.out.print("[Team B] " + getName());

        if (isRage) {
            finalDamage *= 2;
            rageStrikesTriggered++;
            String trigger = healthRage ? "HP<50%" : "3rd turn";
            System.out.print(" (RAGE x2 by " + trigger + ": " + finalDamage);
        } else {
            System.out.print(" -> " + target.getName());
        }
        
        target.takeDamage(finalDamage);
        totalDamageDealt += finalDamage;
    }
    
    @Override
    public String getStatus() {
        return String.format("BossMonster(name=%s, HP=%d/%d, AP=%d, Threat=%d)",
                getName(), getHealth(), getMaxHealth(), 
                getAttackPower(), getThreatLevel());
    }

    @Override
    public String getStatRingkas() {
        return String.format(
            "- Boss Rage terpicu: %d kali",
            this.rageStrikesTriggered
        );
    }
}
