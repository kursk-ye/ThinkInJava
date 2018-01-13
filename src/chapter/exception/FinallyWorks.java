package chapter.exception;

import static kursk.Kutils.println;

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new ThreeException();
                println("no exception");
            }   catch (ThreeException e){
                println("ThreeException");
            }   finally {
                println("in finally clause");
                if(count == 2) break;
            }
        }
    }
}
