package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/25.
 */
public class Instanceinit {
    private String s1;
    private String s2;
    private int    i1;
    private int    i2;

    Instanceinit (int i) {
        println("i1:" + i1);
    }

    Instanceinit (String s) {
        println("s1:" + s1 );
    }

    {
        s1="s1";
        s2="s2";
        i1=1;
        i2=2;
    }

    public static void main(String[] args) {
        Instanceinit i1 = new Instanceinit(8);
        Instanceinit i2 = new Instanceinit("123");
    }
}
