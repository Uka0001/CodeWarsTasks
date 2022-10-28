package org.example;

public class Fighter {
    private int health;
    private int damagePerHit;

    public Fighter(int health, int damagePerHit) {
        this.health = health;
        this.damagePerHit = damagePerHit;
    }

    public Fighter() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }

    public void setDamagePerHit(int damagePerHit) {
        this.damagePerHit = damagePerHit;
    }

    // write getters for the fields
}

