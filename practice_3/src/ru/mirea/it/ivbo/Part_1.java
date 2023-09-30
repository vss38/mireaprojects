package ru.mirea.it.ivbo;

import java.util.Arrays;
import java.util.Random;

public class Part_1 {
    public Part_1() {
        Random rnd = new Random();
        int size = rnd.nextInt(15);
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float) Math.random();
        }

        System.out.println("До сортировки");
        output(array);

        Arrays.sort(array);

        System.out.println("\nПосле сортировки");
        output(array);
    }

    public static void output(float[] array) {
        for (int i = 0; i < array.length; i++)  {
            System.out.println(array[i] + "  ");
        }
    }
}
