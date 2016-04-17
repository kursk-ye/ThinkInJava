package chapter.polymorphism.upcast;

import chapter.polymorphism.upcast.sun.Sun;

/**
 * Created by kursk on 2016/4/12.
 */
public class Test {
    static void run(Parent p){
        p.Prun();
    }

    public static void main(String[] args) {
        Parent p = new Sun();
        run(p);

    }
}
