package ru.geekbrains.java3.lesson_one;

import java.util.Arrays;

public class MainApp<T> {


    public static void main(String[] args) {
        Swap<Integer> swap = new Swap<>();

        Integer[] ints = new Integer[]{1,2,3,4,5};
        swap.swap(ints, 0, 4);

        System.out.println(Arrays.toString(ints));
    }
}