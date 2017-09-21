package chapter.innerclass.exercise20;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-9-21.
 */
interface  int1{
    void f();
    class InnerClass{
        void method1(){println("nest class method1");};
    }
}

public class NestClassInterface implements int1 {
    public void f(){println("f()");}

    public static void main(String[] args) {
        NestClassInterface c = new NestClassInterface();
        c.f();
        c.InnerClass.method1();
    }
}
