package chapter.exception;

import static kursk.Kutils.println;

class Exception5 extends Exception{
}

class Exception6 extends Exception{
}

public class Exe10 {
    void h() {
        try{
            this.f();
        }catch (Exception e){
            println("exception5 from h()");
            throw new RuntimeException(e);
        }
    }

    void f()  {
        try{
            this.g();
        }catch (Exception5 e){
            println("exception5 from f()");
            //e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }
    }

    void g() throws Exception5{
        println("exception5 from g()");
        throw new Exception5();
    }

    public static void main(String[] args) {
        Exe10 ex = new Exe10();
        ex.h();
    }
}
