package org.example;

import javax.sound.midi.Soundbank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задание 1
        Dog doggie = new Dog ("Bobik");
        doggie.run(1500);
        doggie.swim(9);

        Dog drug = new Dog("Druzhok");
        drug.run(60);
        drug.swim(15);

        Cat kitty = new Cat("Pussie");
        kitty.run(400);
        kitty.swim(600);

        Cat kit = new Cat("Marsik");
        kit.swim(2);
        kit.run(201);

        Cat[] catsArray = new Cat[2];
        catsArray[0] = kitty;
        catsArray[1] = kit;

        System.out.println("Всего животных : " + Animal.getObjectCount());
        System.out.println("Всего собак : " + Dog.getObjectCount());
        System.out.println("Всего котов : " + Cat.getObjectCount());

        Miska misochka = new Miska(10);
        System.out.println("Создана миска. Остаток: " + misochka.getFood());

        misochka.addFood(40);
        System.out.println("Добавлена еда. Остаток: " + misochka.getFood());

        System.out.println("Сытость: " + kitty.getSatiety());
        kitty.eat(misochka, 100);
        System.out.println("Сытость: " + kitty.getSatiety());

        System.out.println("Остаток в миске: " + misochka.getFood());
        kitty.eat(misochka, 10);
        System.out.println("Сытость: " + kitty.getSatiety());

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eat(misochka, 30);
            if (catsArray[i].getSatiety())
                System.out.println(catsArray[i].name + " сыт(а)");
            else
                System.out.println(catsArray[i].name + " голоден(на)");
        }

        misochka.addFood(100);
        System.out.println("Добавили еду в миску. Остаток: " + misochka.getFood());

        //Задание 2
        Circle circle = new Circle(5.0);
        circle.setColors("Черный", "Белый");

        System.out.println("Круг");
        System.out.println("Площадь: " + circle.square());
        System.out.println("Периметр: " + circle.perimeter());
        System.out.println("Цвет заливки: " + circle.fill_color);
        System.out.println("Цвет границы: " + circle.fill_border_color);

        Rectangle rectangle = new Rectangle(7, 5);
        circle.setColors("Фиолетовый", "Оранжевый");

        System.out.println("Прямоугольник");
        System.out.println("Площадь: " + rectangle.square());
        System.out.println("Периметр: " + rectangle.perimeter());
        System.out.println("Цвет заливки: " + rectangle.fill_color);
        System.out.println("Цвет границы: " + rectangle.fill_border_color);

        Triangle triangle = new Triangle(1,2,3);
        triangle.setColors("Черный", "Белый");

        System.out.println("Круг");
        System.out.println("Площадь: " + triangle.square());
        System.out.println("Периметр: " + triangle.perimeter());
        System.out.println("Цвет заливки: " + triangle.fill_color);
        System.out.println("Цвет границы: " + triangle.fill_border_color);


    }

}