package chapter.exception;

import static kursk.Kutils.println;

/**
 * Created by kursk on 12/21/2017.
 */
public class Rethrowing {
    public static void f() throws Exception {
        println("originating the exception in f() ");
        throw new Exception("throw from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        }catch (Exception e){
            println(" inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        }catch (Exception e){
            println(" inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e){
            println("main : printStackTrace()");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e){
            println("main : printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
