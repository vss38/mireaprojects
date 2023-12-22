package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.set(0, 1);
        integerArray.set(1, 2);
        integerArray.set(2, 3);
        integerArray.set(3, 4);
        integerArray.set(4, 5);

        System.out.println(integerArray.get(2));

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "Привет");
        stringArray.set(1, "Мир");

        System.out.println(stringArray.get(1));
    }
}