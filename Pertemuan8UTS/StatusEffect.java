package Pertemuan8UTS;

public interface StatusEffect {
    void onTurnStart(Character self);
    void onTurnEnd(Character self);
    boolean isExpired();

    int onDamageTaken(int baseDamage);
    
    String getStatusLog();
}