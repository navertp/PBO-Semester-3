package Pertemuan7UTS;

import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private int turn = 1;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    private boolean isTeamAlive(List<Character> team) {
        for (Character c : team) {
            if (c.isAlive()) return true;
        }
        return false;
    }

    private Character getPlayerTarget(List<Character> enemies) {
        return enemies.stream()
                .filter(Character::isAlive).min(Comparator.comparing(Character::getThreatLevel).reversed().thenComparing(Character::getHealth)).orElse(null);
    }

    private Character getEnemyTarget(List<Character> players) {
        return players.stream()
                .filter(Character::isAlive).max(Comparator.comparing(Character::getHealth)).orElse(null);
    }

    private void printSetup() {
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        for (Character c : teamA) {
            System.out.println("- " + c.getStatus());
            String skillLog = c.getSkillLog();
            if (!skillLog.isEmpty()) {
                System.out.println("Skills: " + skillLog);
            }
            System.out.println("Effects: " + c.getEffectLog());
        }
        
        System.out.println("Team B:");
        for (Character c : teamB) {
            System.out.println("- " + c.getStatus());
        }
        
        System.out.println("Damage rules:");
        System.out.println("---------------------------------");
    }
    
    private void printResult() {
        System.out.println("=== RESULT ===");
        if (isTeamAlive(teamA)) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Team B menang!");
        }
        
        System.out.println("Sisa HP:");
        for (Character c : teamA) {
            System.out.printf("- %s(%s): %d/%d\n", c.getClass().getSimpleName(), c.getName(), c.getHealth(), c.getMaxHealth());
        }
        for (Character c : teamB) {
            System.out.printf("- %s(%s): %d/%d\n", c.getClass().getSimpleName(), c.getName(), c.getHealth(), c.getMaxHealth());
        }
        
        System.out.println("Stat ringkas:");
        for (Character c : teamA) {
            String stats = c.getStatRingkas();
            if (!stats.isEmpty()) {
                System.out.println(stats);
            }
        }
        for (Character c : teamB) {
            String stats = c.getStatRingkas();
            if (!stats.isEmpty()) {
                System.out.println(stats);
            }
        }
        
        System.out.println("---------------------------------");
    }

    public void run() {
        printSetup();
        
        while (isTeamAlive(teamA) && isTeamAlive(teamB)) {
            System.out.println("=== TURN " + turn + " ===");

            Character playerTarget = getPlayerTarget(teamB);
            if (playerTarget != null) {
                for (Character attacker : teamA) {
                    if (attacker.isAlive()) {
                        attacker.performTurn(playerTarget);
                    }
                }
            }

            if (!isTeamAlive(teamB)) break;

            Character enemyTarget = getEnemyTarget(teamA);
            if (enemyTarget != null) {
                for (Character attacker : teamB) {
                    if (attacker.isAlive()) {
                        attacker.performTurn(enemyTarget);
                    }
                }
            }
            
            turn++;
            System.out.println("---------------------------------");
        }
        
        printResult();
    }
}
