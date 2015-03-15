package org.waspec.lesson017;


/**
 * Created by Administrator on 2015/3/2.
 */
public class TestOfTeacher {
    public static void main(String[] args){
        Human h1= new ComputerTeacher();
        h1.setAge(20);
        System.out.printf("My age is %d\n", h1.getAge());
        h1.eat();

        Teacher h2= new ABCNewComputerTeacher();
        h2.setAge(20);
        System.out.printf("My new age is %d\n", h2.getAge());
        h2.teach();
        System.out.println(h2._age);

    }
}

class ABCNewComputerTeacher extends Teacher{
    @Override
    public int getAge(){
        return this._age+1;//TODO:
    }

    @Override
    void teach() {
        System.out.println("I can teach More than Java");
    }
}