package Lesson4;

public class MultiThreading {

    private Object mon = new Object();
    private char currentLetter = 'A';

    private void printA(){
        synchronized (mon) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (currentLetter != 'A') {
                        mon.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printB(){
        synchronized (mon) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printC(){
        synchronized (mon) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        MultiThreading mt = new MultiThreading();

        new Thread(()->{
                mt.printA();
        }).start();

        new Thread(()->{
                mt.printB();
        }).start();

        new Thread(()-> {
                mt.printC();
        }).start();
    }
}
