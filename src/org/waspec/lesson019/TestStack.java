package org.waspec.lesson019;

import java.util.Stack;

/**
 * Created by Administrator on 2015/3/4.
 */
public class TestStack {
    public static void main(String[] args){
        Stack<Student> studentStack = new Stack<Student>();
        studentStack.push(new Student(1));
        studentStack.push(new Student(2));
        System.out.println(studentStack.size());


    }
}

class Student{
    private int _id;

    public Student(int id) {
        this._id = id;
    }

    public int get_id() {
        return this._id;
    }

}