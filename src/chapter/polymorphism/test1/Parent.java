package chapter.polymorphism.test1;

import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/12.
 */
public class Parent {
    void take(){
        print("parent take");
    }

    private void  run(){
        print("parent run");
    }

    static void  add(Sun t){
        t.take();
        t.run();
    }

    public static void main(String[] args) {
        Sun s = new Sun(); //parent take      parent run
        Parent s2 = new Sun(); //parent take      parent run
        add(s);
        //add(s2);
    }
}

class Sun extends Parent {
    void run(){
        print("sun run");
    }
}