package org;

public class Test2 {
    public static void main(String args[]) {

        Integer i = 10;
        System.out.println(i);
        System.out.println("1");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
        super.finalize();
    }
}
