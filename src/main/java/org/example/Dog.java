package org.example;

public class Dog extends Animal {
    public static int objectCount =0 ;


    public Dog (String name) {
        this.name = name;
        this.distRun = 500;
        this.distSwim = 10;
        objectCount++;
    }
    public static int getObjectCount() {
        return objectCount;}
}
