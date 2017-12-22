package chapter.exception;

class VeryImportantException2 extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException2 extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class MeaninglessException extends Exception {
    public String toString() {
        return "A meaningless exception";
    }
}

public class LostMessage18 {
    void f() throws VeryImportantException2 {
        throw new VeryImportantException2();
    }
    void dispose() throws HoHumException2 {
        throw new HoHumException2();
    }
    void eliminate() throws MeaninglessException {
        throw new MeaninglessException();
    }
    public static void main(String[] args) {
        try {
            LostMessage18 lm = new LostMessage18();
            try {
                try {
                    lm.f();
                    lm.dispose();
                } finally {
                    lm.eliminate();
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
