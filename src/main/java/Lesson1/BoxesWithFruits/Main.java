package Lesson1.BoxesWithFruits;

import Lesson1.BoxesWithFruits.Box.Box;
import Lesson1.BoxesWithFruits.Fruit.Apple;
import Lesson1.BoxesWithFruits.Fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();


        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox.pourFruit(orangeBox);



        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compareTo(orangeBox));
    }
}
