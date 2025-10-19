package Pertemuan7UTS;

public interface Skill {
    String name();
    void onTurnStart(Character self);
    boolean isAttackModifier();
    void onAttack(Character self, Character target, int baseDamage);
}