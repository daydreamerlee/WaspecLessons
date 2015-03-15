package org.waspec.lesson018;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2015/3/4.
 */
public class SetTest {
    public static void main(String[] args){
        Set<Student> studentSET = new HashSet<Student>();
        testAdd(studentSET);
        for (Student s:studentSET){
            System.out.println(s.get_id());
        }

        System.out.println(!studentSET.isEmpty());
        System.out.println(studentSET.size());

    }

    public static void testAdd(Set<Student> inputSet){
        inputSet.add(new Student(1));
        inputSet.add(new Student(2));
        inputSet.add(new Student(3));
        inputSet.add(new Student(4));

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
