package chapter.polymorphism.dispose;

import  static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/14.
 */
public class Eat {
    private String s;

    Eat(String s){
        this.s = s;
        print("eat is created");
    }

    void dispose(){
        print( s+" eat is dispose");
    }
}
