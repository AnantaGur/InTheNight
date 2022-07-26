package com.Demi;

public class Actions implements Status{
    private int health = 20;
    private String status;
    int rand;

    public int getHit(){
        int max = 20;
        int min = 1;
        int range = max - min + 1;

        this.rand = (int)(Math.random() * range) + 1;
        return health -= rand;
    }

    @Override
    public int getHealth() {
        int currentHealth = 20;
        currentHealth -= rand;
        System.out.println(currentHealth);

        return currentHealth;
    }

    @Override
    public String getStatus() {
        return null;
    }
}
