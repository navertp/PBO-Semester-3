package Pertemuan8UTS;

public class LevelScaledStrategy implements AttackStrategy {
    private int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int levelBonus = self.getLevel() * this.bonusPerLevel;
        return self.getAttackPower() + levelBonus;
    }
    
    @Override
    public String toString() {
        return "LevelScaled(+" + bonusPerLevel + "/level)";
    }
}
