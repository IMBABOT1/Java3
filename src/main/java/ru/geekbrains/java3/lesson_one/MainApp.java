package ru.geekbrains.java3.lesson_one;

public class MainApp {

    public static void main(String[] args) {
        Box<Orange> box = new Box<>();
        box.addFruit(new Orange());
        box.addFruit(new Orange());
        box.addFruit(new Orange());
    }
}
