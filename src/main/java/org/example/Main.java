package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] stringArray = {
                {"1", "2", "3", "2"},
                {"4", "5", "6", "7"},
                {"8", "9", "6", "2"},
                {"0", "8", "5", "у"}
        };

        //Задание 1
        CheckMyArray(stringArray);

        //Задание 2
        try {
            int sum = SumArray(stringArray);
            System.out.println("Сумма элементов массива: " + sum);
        }
        catch (MyArrayDataException e){
            System.out.println("Ошибка преобразования: " + e.getMessage());
        }

        //Задание 3
        int a = 5;
        int b = 6;

        try {
            System.out.println("Элемент с индексом [" + a +"][" + b + "]:" + stringArray[a][b]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Вывод: Индекс выходит за пределы массива.");
        }


    }

    public static void CheckMyArray(String[][] myArray){

        int rows = myArray.length;
        if (rows != 4) {
            throw new MyArraySizeException("Количество строк не равно 4");
        }

        for (int col = 0; col < rows; col++) {
            if (myArray[col].length != 4) {
                throw new MyArraySizeException("Количество столбцов не равно 4");
            };
        }

    }

    public static int SumArray(String[][] myArray) throws MyArrayDataException{

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке ["+ i +"]["+ j +"] нет числа");
                }
            }
        }

        return sum;
    }
}

