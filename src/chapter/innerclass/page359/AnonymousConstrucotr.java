package chapter.innerclass.page359;

import static kursk.Kutils.*;

/**
 * Created by kursk on 9/20/2017.
 */
abstract class Base {
    public Base (int i) {
        println("Base constructor, i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstrucotr {
    public static Base getBase(int i){
        return new Base(i){
            {println("Inside instance initializer " + i);}
            public void f(){
                println("In anonymous f(): " + i);
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
