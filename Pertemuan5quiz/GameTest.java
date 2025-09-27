package Pertemuan5quiz;

public class GameTest {
    public static void main(String[] args) {
        Player p1 = new Player("HeroEvan", 100, 20, 5);
        Monster m1 = new Monster("Goblin", 80, 15, "Goblin");
        Monster m2 = new Monster("Dragon", 200, 30, "Dragon");
        BossMonster boss = new BossMonster("Ender Dragon", 150, 25, "Dragon");

        while (p1.getHealth() > 0 && boss.getHealth() > 0) {
            p1.attack(boss);
            if (boss.getHealth() <= 0) break;

            boss.attack(p1);
            if (p1.getHealth() <= 30) {
                p1.heal(20);
            }
        }

        if (p1.getHealth() > 0) {
        System.out.println(p1.getName() + " wins!");
        } else {
            System.out.println(boss.getName() + " wins!");
        }
    }
}