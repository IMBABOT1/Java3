package ru.geekbrains.java3.lesson_one;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<Fruit> list;

    public Box(){
        list = new ArrayList<>();
    }

    public void addFruit(T t) {
        list.add(t);
    }

    public void pour(Box<T> box) {
        for (Fruit f: list){
            box.list.add(f);
        }

        this.list.clear();
    }

    public float getWeight(){
        float weight = 0;

        for (Fruit f : list){
            weight += f.getWeight();
        }

        return weight;
    }


    public boolean compareTo(Box o) {
         return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }
}



