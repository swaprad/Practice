package org;

public class InheritanceExample2 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
class A {
    A() {
        System.out.println("A()");
        fun();
    }
    public static void fun() {
        System.out.println("A-fun()");
    }
}
class B extends A {
    B() {
        System.out.println("B()");
        fun();
    }
    public static void fun() {
        System.out.println("B-fun()");
    }
}
