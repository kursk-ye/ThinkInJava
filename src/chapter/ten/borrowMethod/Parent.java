package chapter.ten.borrowMethod;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/8.
 */
public class Parent {
    void take(){
        print("parent take");
    }

    void run(){
        print("parent run");
    }

    static void  add(Parent t){
        t.take();
        t.run();
    }

    public static void main(String[] args) {
        Sun s = new Sun();
        add(s);
    }
}

class Sun extends Parent {
    void run(){
        print("sun run");
    }
}