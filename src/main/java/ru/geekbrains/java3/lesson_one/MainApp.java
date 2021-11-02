package ru.geekbrains.java3.lesson_one;

public class MainApp {

    public static void main(String[] args) {
        Box<Orange> box = new Box<>();
        box.addFruit(new Orange());
        box.addFruit(new Orange());
        box.addFruit(new Orange());
        box.addFruit(new Orange());

        System.out.println(box.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());



        System.out.println(box.compareTo(appleBox));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        box.pour(orangeBox);

    }
}
