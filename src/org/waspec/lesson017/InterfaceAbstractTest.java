package org.waspec.lesson017;

/**
 * Created by Administrator on 2015/3/2.
 */
public class InterfaceAbstractTest {
    public static void main(String[] args){ //Entry of Test

    }


}

interface Human{
    void speak();
    void eat();
    void setAge(int age);
    int getAge();
}

abstract class Teacher implements Human {
    protected int _age;

    @Override
    public void speak() {
        System.out.println("I can speak!");
    }

    @Override
    public void eat() {
        System.out.println("Yummy Yummy");
    }

    @Override
    public void setAge(int age) {
        this._age=age;
    }

    @Override
    public int getAge() {
        return this._age;
    }

    abstract void teach();
}

class ComputerTeacher extends Teacher{

    @Override
    void teach() {
        System.out.println("I can teach Java!");
    }
}