package ru.geekbrains.java3.lesson_one.temp;

import java.util.Arrays;
import java.util.List;

public class ConvertArray<T> {

    public List<T> convertArray(T[] arr){
        List<T> list = Arrays.asList(arr);
        return list;
    }
}
