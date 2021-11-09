package Lesson1.Swap;

public class Swap<T> {

    public void swap(T[]arr, int first, int second){
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
