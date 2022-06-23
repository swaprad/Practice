package org;

class Base {
    protected int i;

    Base() {
        System.out.println("Base()");
        add(1);
    }

    int add(int v) {
        System.out.println("Base-add");
        i += v;
        return v;
    }
}

class Extension extends Base {
    Extension() {
        System.out.println("Extension()");
        add(1);
    }

    int add(int v) {
        System.out.println("Extension-add");
        i += v * 2;
        return i;
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        System.out.println(" " + bogo(new Extension()));
    }

    static int bogo(Base b) {
        return b.add(8);
    }
}