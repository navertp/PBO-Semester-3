package Pertemuan8UTS;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    public static void main(String[] args) {
        
        AttackStrategy playerStrategy = new LevelScaledStrategy(2);
        AttackStrategy enemyStrategy = new FixedStrategy();

        Player p1 = new Player("HeroEvan", 100, 25, 5, playerStrategy);
        
        p1.addSkill(new HealSkill(15));
        p1.addSkill(new PiercingStrike(1.2));

        p1.addEffect(new Shield(10, 3));
        p1.addEffect(new Regen(8, 4));

        List<Character> teamA = new ArrayList<>();
        teamA.add(p1);

        Character boss = new BossMonster("Ender Dragon", 150, 28, 5, enemyStrategy);
        Character monster = new Monster("Goblin", 80, 12, 2, enemyStrategy);

        List<Character> teamB = new ArrayList<>();
        teamB.add(boss);
        teamB.add(monster);

        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}
