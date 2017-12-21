package chapter.exception;

import static kursk.Kutils.println;

class MyException2 extends Exception{
    MyException2(String msg){
        super(msg);
        println(msg);
    }
}

public class Exe1 {
    void f() throws MyException2{
        println("throw from f()");
        throw new MyException2("MyException");
    }

    public static void main(String[] args) {
        Exe1 exe = new Exe1();
        try{
            exe.f();
        }catch (MyException2 e){
            e.printStackTrace(System.out);
        }finally {
            println("here is finally");
        }
    }
}
