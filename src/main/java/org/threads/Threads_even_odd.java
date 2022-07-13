package org.threads;

public class Threads_even_odd {
    private int counter = 1;

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
