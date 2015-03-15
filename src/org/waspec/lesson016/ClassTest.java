package org.waspec.lesson016;

/**
 * Created by Administrator on 2015/2/25.
 */
public class ClassTest {
    Human human = new Human();
    Girl girl = new Girl();


}

class Human {
    public int age = 1;

    public void speak() {
        System.out.println("I am a Human.");
    }

    public void eat() {

    }
}

class Girl extends Human {
    public void lovePretty() {
        System.out.println(String.format("I am %d years old", this.age));
    }

    @Override
    public void speak() {
        System.out.println("I am a girl");
    }

}
