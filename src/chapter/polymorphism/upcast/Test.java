package chapter.polymorphism.upcast;

import chapter.polymorphism.upcast.sun.Child;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/4/12.
 */
public class Test {

    static void work(Parent p){
        println(p.name);
    }

    public static void main(String[] args) {
        Child p = new Child();
        work(p);
    }
}
