package Pertemuan7UTS;

public class Regen implements StatusEffect {
    private int duration;
    private final int perTurn;

    public Regen(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.duration = duration;
    }

    @Override
    public void onTurnStart(Character self) {}

    @Override
    public void onTurnEnd(Character self) {
        if (!isExpired()) {
            System.out.print(self.getName() + " Regen: +" + perTurn + " HP");
            self.heal(perTurn);
            System.out.println(" => " + self.getHealth());
            duration--;
        }
    }

    @Override
    public boolean isExpired() { return duration <= 0; }

    @Override
    public int onDamageTaken(int baseDamage) {
        return baseDamage;
    }

    @Override
    public String getStatusLog() {
         return "Regen(active, +" + perTurn + " at end)";
    }
    
    @Override
    public String toString() {
         return "Regen(+" + perTurn + " HP, " + duration + " turns)";
    }
}
