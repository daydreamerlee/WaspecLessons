package org.waspec.lesson021;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/3/9.
 */
public class TestReflection {
    public static void main(String[] args) {
        try {
            Class reflectedClass = Class.forName("org.waspec.lesson021.Student");
            Object object = reflectedClass.newInstance();
            Method reflectedMethod = reflectedClass.getDeclaredMethod("speak");
            reflectedMethod.invoke(object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("No class found!");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("No method found!");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    public int id;
    public String name;

    public void speak() {
        System.out.println("I can speak!");
    }
}