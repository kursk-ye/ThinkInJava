package chapter.polymorphism.upcast.sun;

import chapter.polymorphism.upcast.Parent;
import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/12.
 */
public class Sun extends Parent {
    private String name = "sun";
    private int age = 12;

    private void run(){
        print("sun run");
    }

    protected void Manrun(){
        //print(name + " run");
        run();
    }
}
