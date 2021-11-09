package Lesson1.BoxesWithFruits.Box;

import Lesson1.BoxesWithFruits.Fruit.Apple;
import Lesson1.BoxesWithFruits.Fruit.Fruit;
import Lesson1.BoxesWithFruits.Fruit.Orange;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {
    private List<Fruit> list;

    public Box(){
        this.list = new ArrayList<>();
    }

    public float getWeight(){
        float weight = 0;

        for (Fruit f: list){
            weight += f.getWeight();
        }

        return weight;
    }

    public void addFruit(T t){
        list.add(t);
    }

    public void pourFruit(Box<? extends Fruit> box){
        if (this == box){
            return;
        }


        for (Fruit f : this.list){
            box.list.add(f);
        }

        this.list.clear();
    }

    @Override
    public int compareTo(Box o) {
       return (int) (this.getWeight() - o.getWeight());
    }

}
