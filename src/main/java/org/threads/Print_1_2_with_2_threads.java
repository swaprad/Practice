package org.threads;

public class Print_1_2_with_2_threads {
    private int counter = 1;

    public static void main(String[] args) {
        Print_1_2_with_2_threads obj = new Print_1_2_with_2_threads();
        Thread t1 = new Thread(() -> obj.print(0), "odd");
        Thread t2 = new Thread(() -> obj.print(1), "even");
        t1.start();
        t2.start();

    }
    public void print(int evenOrOdd) {
        synchronized (this) {
            for (int i=0; i<5; i++) {
                while (counter % 2 == evenOrOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter++);
                notify();
            }
        }
    }
}
