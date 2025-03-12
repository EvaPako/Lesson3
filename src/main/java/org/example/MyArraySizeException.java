package org.example;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {

        super("Ошибка размера массива");
    }

    public MyArraySizeException(String message) {

        super(message);
    }
}
