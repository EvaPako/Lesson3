package org.example;

public class Cat extends Animal {
    public static int objectCount = 0;
    private boolean satiety = false;

    public Cat (String name) {
        this.name = name;
        this.distRun = 200;
        this.distSwim = 0;
        this.satiety = false;
        objectCount++;
    }

    public void eat(Miska miska, int tryEat) {
        System.out.println(this.name + " пытается съесть " + tryEat);
        this.satiety = this.satiety | miska.eatFood(tryEat);
    }

    public boolean getSatiety(){
        return this.satiety;
    }

    public static int getObjectCount() {
        return objectCount;}
}