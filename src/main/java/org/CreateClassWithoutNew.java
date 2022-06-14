package org;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateClassWithoutNew {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, CloneNotSupportedException {
        Class<?> dc = Class.forName("org.practice.DemoClass");
        DemoClass demoClass = (DemoClass) dc.newInstance();
        demoClass.fun();

        DemoClass demoClass1 = (DemoClass) DemoClass.class.getClassLoader()
                .loadClass("org.practice.DemoClass").newInstance();
        demoClass1.fun();

        DemoClass demoClass2 = new DemoClass();
        DemoClass demoClass3 = (DemoClass) demoClass2.clone();
        demoClass3.fun();



    }
}
