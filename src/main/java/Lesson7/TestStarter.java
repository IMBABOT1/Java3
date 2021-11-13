package Lesson7;

import Lesson7.Annotation.AfterSuite;
import Lesson7.Annotation.BeforeSuite;
import Lesson7.Annotation.Common;
import Lesson7.Annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestStarter {

    public static void start(Class c)throws IllegalAccessException, InvocationTargetException {
        Method[] methods = c.getDeclaredMethods();

        int before = 0;
        int after = 0;

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                before++;
            } else if (m.isAnnotationPresent(AfterSuite.class)) {
                after++;
            }
        }


        if (before > 1 || after > 1) {
            throw new RuntimeException("Methods with annotation BeforeSuite or AfterSuite must be not greater then one: " +
                    "before: " + before + " " + "after: " + after);
        }

        for (int i = 0; i < methods.length ; i++) {
            for (int j = 0; j < methods.length - i - 1; j++) {
                if (methods[j].getAnnotation(Common.class).priority() > methods[j + 1].getAnnotation(Common.class).priority()) {
                    Method m = methods[j];
                    methods[j] = methods[j + 1];
                    methods[j + 1] = m;
                }
            }
        }

        for (int i = methods.length - 1; i >= 0 ; i--) {
            methods[i].invoke(null);
        }
    }



    public static void main(String[] args) {
        try {
            start(TestClass.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
