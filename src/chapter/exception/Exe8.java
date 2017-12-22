package chapter.exception;

import static kursk.Kutils.println;

class Exception4 extends Exception {
    private String msg;
    Exception4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }
    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}

public class Exe8 {
    void f(int i) throws Exception4,Exception2{
        println("throw from f()");
        if (i > 1) {
            throw new Exception4("throw new Exception4");
        }else {
            throw new Exception2();
        }

    }

    public static void main(String[] args) {

        Exe8 ex =  new Exe8();
        try{
            ex.f(0);
        }catch (Exception4 e){
            e.printStackTrace(System.out);
        }catch (Exception2 e){
            e.printStackTrace(System.out);
        }
    }
}
