package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/1.
 */
public class  Nestedclass implements Nestedin {
    public void f(){

    }

    public static void main(String[] args) {
        //Nestedclass.Nested.main(args);
        Nestedclass.Nested.f2();
    }
}

interface Nestedin {
    void f();

    class Nested implements Nestedin {
        public void f(){
            println("nested class implements interface");
        }

        public static void f2() {
            println("f2");
        }

        public static void main(String[] args) {
            Nested n = new Nested();
            n.f();
        }
    }
}


