package chapter.exception;

import static kursk.Kutils.print;

class ExceptionA extends Exception {
    ExceptionA(String msg) { super(msg); }
}

class ExceptionB extends Exception {
    ExceptionB(String msg) { super(msg); }
}

class ExceptionC extends Exception {
    ExceptionC(String msg) { super(msg); }
}

public class Exe13 {
    private static Integer[] x = new Integer[1];
    public static void f(int x)
            throws ExceptionA, ExceptionB, ExceptionC {
        if(x < 0) throw new ExceptionA("x < 0");
        if(x == 0) throw new ExceptionB("x == 0");
        if(x > 0) throw new ExceptionC("x > 0");
    }
    public static void main(String[] args) {
        try {
            // to throw NullPointerException:
            f(x[0]);
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type:
        } catch(Exception e) {
            print("Caught Exception");
            e.printStackTrace(System.out);
        } finally {
            print("made it to finally");
        }
    }
}
