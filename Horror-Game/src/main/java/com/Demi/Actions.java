package com.Demi;

public class Actions extends Main implements Status{
    private int health = 20;
    private int demiHealth = 300;
    private String status;
    int randUser;
    int randAttack;


    public int getHit(){
        int max = 20;
        int min = 1;
        int range = max - min + 1;

        System.out.println("You get Hit!");

        this.randUser = (int)(Math.random() * range) + 1;
        System.out.println("You get hit for: " + randUser + " Damage");
        System.out.println("You have: " + getHealth() + " HP left");
        return health -= randUser;
    }

    public int attack(){
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        System.out.println("You attack!");
        this.randAttack = (int)(Math.random() * range) + 1;
        System.out.println("You hit for: " + randAttack + " Damage");
        System.out.println("It has: " + getMonsterHealth() + " HP left");
        return demiHealth -= randAttack;
    }

    public int getInstant(){
        int max = 20;

        System.out.println("The monster attacks you for: " + max);

        return health -= max;
    }

    @Override
    public int getHealth() {
        int currentHealth = health;
        currentHealth -= randUser;

        return currentHealth;
    }

    @Override
    public int getMonsterHealth() {
        int currentDemiHealth = demiHealth;
        currentDemiHealth -= randAttack;

        return currentDemiHealth;
    }

    @Override
    public String setStatus(String changeStatus) {
        this.status = changeStatus;
        System.out.println("\n-------------");
        System.out.println("Your current status is: " + status);
        System.out.println("-------------");
        return this.status;
    }


}
