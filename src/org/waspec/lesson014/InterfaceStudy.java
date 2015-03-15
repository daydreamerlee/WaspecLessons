package org.waspec.lesson014;

/**
 * Created by Administrator on 2015/2/23.
 */
public class InterfaceStudy {
    private Runable tools;

    public void setTools(Runable tools) {
        this.tools = tools;
    }

    public static void testInterface(){
        Runable tool1=new Tank();
        Runable tool2=new Truck();
        tool1.run();
        tool2.run();
        return;
    }
}

interface Runable{
    public abstract void run();
}

class Tank implements Runable{
    @Override
    public void run() {
        System.out.println("I'm running on the Highway 80.");
    }
}

class Truck implements Runable{
    @Override
    public void run() {
        System.out.println("I'm running on the Battlefield.");
    }
}