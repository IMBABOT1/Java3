package ru.geekbrains.java3.lesson_one;

import java.util.List;

public class Box<T extends Fruit> {

    private List<Fruit> list;

    public void addFruit(T t) {
        list.add(t);
    }

    public void pour(Box<T> box) {
        this.list.clear();
        for (Fruit f : box.list) {
            list.add(f);
        }
    }

    public float getWeight(Box<T> box){
        float weight = 0;

        for (Fruit f : list){
            weight = f.getWeight();
        }

        return weight;
    }

}



