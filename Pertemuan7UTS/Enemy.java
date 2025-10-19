package Pertemuan7UTS;

public abstract class Enemy extends Character {
    private int threatLevel;
    protected AttackStrategy strategy;

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        
        if (threatLevel < 1 || threatLevel > 5) {
            int originalThreat = threatLevel;
            this.threatLevel = Math.max(1, Math.min(5, threatLevel));
            System.out.println("[WARNING] Input threatLevel untuk " + name + " tidak valid (" + originalThreat + "). Diatur ke " + this.threatLevel + ".");
        } else {
            this.threatLevel = threatLevel;
        }

        if (strategy == null) {
            throw new IllegalArgumentException("Strategy tidak boleh null");
        }
        this.strategy = strategy;
    }

    @Override
    public final int getThreatLevel() { 
        return threatLevel; 
    }
}
