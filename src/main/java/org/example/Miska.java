package org.example;

import com.sun.source.tree.TryTree;

public class Miska {
    private int food;

    public Miska (int food){
        this.food = food;
    }

    public void setFood(int food) {
        if (food < 0) {
            this.food = 0;
            System.out.println("Количество еды не может быть отрицательным");
        }
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int add) {
        if (this.food + add < 0)
            System.out.println("В миске недостаточно еды. Остаток: " + this.food);
        else
            this.food += add;
    }

    public boolean eatFood(int tryEat) {
        if (tryEat > this.food) {
            System.out.println("В миске недостаточно еды. Остаток: " + this.food);
            return false;
        } else {
            this.food -= tryEat;
            System.out.println("Съели: " + tryEat + ". Осталось: " + this.food);
            return true;
        }
    }
}
