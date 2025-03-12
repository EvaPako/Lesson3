package org.example;

public class Animal {
    int distRun; //ограничение на бег
    int distSwim; //ограничение на плавание
    String name;
    public static int objectCount = 0;

    public Animal () {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void run(int a) {

        if (a > distRun)
            System.out.println(name + " не может пробежать " + a + " м, а пробежал(а) только " + distRun + " м.");
        else
            System.out.println(name + " пробежал(а) " + a + " м.");
    }

    public void swim (int b) {
        if (distSwim == 0)
            System.out.println(name + " не умеет плавать");
        else if (b > distSwim)
            System.out.println(name + " не может проплыть " + b + " м, а проплыл(а) только " + distSwim + " м.");
        else
            System.out.println(name + " проплыл(а) " + b + " м.");

    }

}
