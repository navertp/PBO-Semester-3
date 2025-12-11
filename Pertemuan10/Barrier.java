package Pertemuan10;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        // Reducing strength by roughly 10% as per suggestion
        this.strength -= (int)(this.strength * 0.1);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength + "\n";
    }
}
