package Lesson7;

import Lesson7.Annotation.AfterSuite;
import Lesson7.Annotation.BeforeSuite;
import Lesson7.Annotation.Common;
import Lesson7.Annotation.Test;

public class TestClass {

    @Common(priority = 10)
    @BeforeSuite(priority = 10)
    public static void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @Common(priority = 9)
    @Test(priority = 9)
    public static void test(){
        System.out.println("Test9");
    }

    @Common(priority = 8)
    @Test(priority = 8)
    public static void test1(){
        System.out.println("Test8");
    }

    @Common(priority = 7)
    @Test(priority = 7)
    public static void test2(){
        System.out.println("Test7");
    }

    @Common(priority = 6)
    @Test(priority = 6)
    public static void test3(){
        System.out.println("Test6");
    }

    @Common(priority = 5)
    @Test(priority = 5)
    public static void test4(){
        System.out.println("Test5");
    }

    @Common(priority = 4)
    @Test(priority = 4)
    public static void test5(){
        System.out.println("Test4");
    }

    @Common(priority = 3)
    @Test(priority = 3)
    public static void test6(){
        System.out.println("test3");
    }

    @Common(priority = 2)
    @Test(priority = 2)
    public static void test7(){
        System.out.println("test2");
    }

    @Common(priority = 1)
    @AfterSuite(priority = 1)
    public static void afterSuite(){
        System.out.println("AfterSuite");

    }
}
