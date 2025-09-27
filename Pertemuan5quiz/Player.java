package Pertemuan5quiz;

class Player extends Character {
    private int level;
    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }
    @Override
    public void attack(Character target) {
        int damage = (int)(super.getHealth() * 0.1) + level; // bonus dari level
        System.out.println(getName() + " attacks with sword! Damage: " + damage);
        target.takeDamage(damage);
    }

    public void heal(int amount) {
        int newHealth = getHealth() + amount;
        setHealth(newHealth);
        System.out.println(getName() + " heals for " + amount + " points ! Current health: " + newHealth);
    }
}