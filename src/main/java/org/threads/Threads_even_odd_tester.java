package org.threads;

public class Threads_even_odd_tester {
    public static void main(String[] args) {
        Threads_even_odd obj = new Threads_even_odd();
        Thread t1 = new Thread(() -> obj.print(0), "odd");
        Thread t2 = new Thread(() -> obj.print(1), "even");
        t1.start();
        t2.start();
    }
}
