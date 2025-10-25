package Pertemuan8UTS;

public class FixedStrategy implements AttackStrategy {

    @Override
    public int computeDamage(Character self, Character target) {
        return self.getAttackPower();
    }

    @Override
    public String toString() {
        return "Fixed";
    }
}
