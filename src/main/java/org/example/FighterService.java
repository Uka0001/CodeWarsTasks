package org.example;

public class FighterService {

    public boolean willFighterWin(Fighter firstFighter, Fighter secondFighter, int hits) {
        int firstAllDamage = firstFighter.getDamagePerHit() * hits;
        int secondHealth = secondFighter.getHealth();
        boolean result;
        if (firstAllDamage >= secondHealth) {
            result = true;
        } else {
            result = false;
        }
        return result;
        // write your code here
    }
}
