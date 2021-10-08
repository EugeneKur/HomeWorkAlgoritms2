package ru.geekbrains.jca.homework2;

public class SelectionSort {
    public static void  sort(Object[][] arr) {
        int [] intArr = new int[arr.length]; //вспомогательный массив для сортировки по производителю
        String lenuvo = "Lenuvo";
        String asos = "Asos";
        String macNote = "MacNote";
        String eser = "Eser";
        String xamiou = "Xamiou";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals(lenuvo)) {
                intArr[i] = 0;
            } else if (arr[i][2].equals(asos)) {
                intArr[i] = 1;
            } else if (arr[i][2].equals(macNote)) {
                intArr[i] = 2;
            } else if (arr[i][2].equals(eser)) {
                intArr[i] = 3;
            } else if (arr[i][2].equals(xamiou)) {
                intArr[i] = 4;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                if ((int)arr[j][0] < (int)arr[min][0]) {
                    min = j;
                } else if ((int)arr[j][0] == (int)arr[min][0]) {
                    if ((int)arr[j][1] > (int)arr[min][1]) {
                        min = j;
                    } else if ((int)arr[j][1] == (int)arr[min][1]) {
                        if (intArr[j] < intArr[min]) {
                            min = j;
                        }
                    }
                }
            }

            if (i == min) {
                continue;
            }

            Object[] temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            int tempInt = intArr[i];
            intArr[i] = intArr[min];
            intArr[min] = tempInt;

        }

        /*for (int i = 0; i < arr.length - 1; i++) { // сравнение по производителю
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (intArr[j] < intArr[min]) {
                        min = j;
                }
            }

            if (i == min) {
                continue;
            }

            Object[] temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            int tempInt = intArr[i];
            intArr[i] = intArr[min];
            intArr[min] = tempInt;

        }*/

    }

}
