package ru.geekbrains.jca.homework2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Notebook {

    public static Object[] getNotebook() {
        Object[] notebook = new Object[3];
        Random random1 = new Random();
        int price = 500 + 50*random1.nextInt(51);
        notebook [0] = price;
        Random random2 = new Random();
        int ram = 4 + 4*random2.nextInt(6);
        notebook[1] = ram;
        String[] producer = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
        Random random3 = new Random();
        int indexProducer = random3.nextInt(producer.length);
        notebook [2] = producer[indexProducer];
        return notebook;

    }


}
