package chapter.exception;

import static kursk.Kutils.println;

public class Exe2 {
    void f(Object o){
        println(o);
    }

    public static void main(String[] args) {
        Object on = null;
        Exe2 ex = new Exe2();
        try {
            ex.f(on);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
