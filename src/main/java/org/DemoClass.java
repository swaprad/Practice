package org;

import java.io.Serializable;

public class DemoClass implements Cloneable {

    public void fun() {
        System.out.println("DemoClass : fun()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
