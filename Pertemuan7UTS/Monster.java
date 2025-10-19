package Pertemuan7UTS;

class Monster extends Enemy {

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        int damage = strategy.computeDamage(this, target);
        System.out.print("[Team B] " + getName() + " -> " + target.getName());
        target.takeDamage(damage);
        totalDamageDealt += damage;
    }
    
    @Override
    public String getStatus() {
        return String.format("Monster(name=%s, HP=%d/%d, AP=%d, Threat=%d)",
                getName(), getHealth(), getMaxHealth(), 
                getAttackPower(), getThreatLevel());
    }
}
