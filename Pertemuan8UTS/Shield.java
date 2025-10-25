package Pertemuan8UTS;

public class Shield implements StatusEffect {
    public int duration;
    private final int flatReduce;

    public Shield(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.duration = duration;
    }

    @Override
    public void onTurnStart(Character self) {}

    @Override
    public void onTurnEnd(Character self) { duration--; }

    @Override
    public boolean isExpired() { return duration <= 0; }

    @Override
    public int onDamageTaken(int baseDamage) {
        int reduction = Math.min(baseDamage, flatReduce);
        System.out.print(", Shield -" + reduction);
        return baseDamage - reduction;
    }

    @Override
    public String getStatusLog() {
        return "Shield(active, " + duration + ")";
    }
    
    @Override
    public String toString() {
        return "Shield(-" + flatReduce + " dmg, " + duration + " turns)";
    }
}
