package chapter.exception;

import static kursk.Kutils.println;

/**
 * Created by kursk on 12/7/2017.
 */

public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                println(ste.getMethodName());
        }
    }
    static void g(){ f(); }

    static void h(){ g(); }

    public static void main(String[] args) {
/*        f();
        println("--------------------");
        g();
        println("--------------------");*/
        h();
    }
}
