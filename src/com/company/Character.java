package com.company;

public class Character {
    private int health;
    private int damage;

    public Character(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }


    public String getInfo(){
        return ("health: "+health+", damage: "+damage);
    }

}
