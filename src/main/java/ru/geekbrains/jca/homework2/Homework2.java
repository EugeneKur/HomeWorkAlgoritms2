package ru.geekbrains.jca.homework2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        int amount = 5000;
        Object[][] arr = new Object[amount][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Notebook.getNotebook();

        }
        print2dArray(arr);
        System.out.println();
        SelectionSort.sort(arr);
        print2dArray(arr);

    }

    static void  print2dArray(Object[][] arr) { // метод вывода 2д массива
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
    }
}
