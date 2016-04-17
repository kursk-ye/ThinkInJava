package chapter.polymorphism.upcast;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/12.
 */

public class Parent {
    private String name = "parent";
    private String sex = "Male";

    private void run(){
        print("parent run");
    }

    protected void Manrun(){
        run();
    }

    public void Prun(){
        run();
    }


}
