package com.brutech.main;

public class Player {
    private String name;
    private int healthPercentage;

    private Weapon weapon;
    public enum Weapon {
        PISTOL,
        MACHINE_GUN

    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        getHealthPercentage(healthPercentage);
        this.weapon = weapon;

    }

    public void getHealthPercentage(int healthPercentage){
        if(healthPercentage > 100){
           this.healthPercentage = 100;
        } else this.healthPercentage = Math.max(healthPercentage, 0);
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public int loseHealth(int damage){
       int health = healthRemaining() - damage;

        if(health <= 0){
            System.out.println(name + " player has been knocked out of game");

        }
        return this.healthPercentage = Math.max(health, 0);

    }

    public int restoreHealth(int healthPotion){
        int health = healthRemaining() + healthPotion;
        return this.healthPercentage = Math.min(100, health);

    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
