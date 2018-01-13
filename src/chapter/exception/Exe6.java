package chapter.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Exception1 extends Exception  {
    private static Logger logger = Logger.getLogger("Exception1");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Exception2 extends Exception {
    private int x;
    public Exception2(){}
    public String getMessage() {
        return "Detail Message : " + super.getMessage();
    }
}

public class Exe6 {
    void f() throws Exception1 {
        throw new Exception1();
    }

    void g() throws Exception2 {
        throw new Exception2();
    }

    public static void main(String[] args) {
        Exe6 ex = new Exe6();
        try{
            ex.f();
        }catch (Exception1 e1){
            Exception1.logException(e1);
        }

        try{
            ex.g();
        }catch (Exception2 e2){
            e2.printStackTrace(System.out);
            e2.getMessage();
        }
    }
}
