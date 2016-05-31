package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/26.
 */
public class Outer2 {
    private String ps="Outer2 ps";
    private void method1() {
        println(ps);
    }

    Outer2 outer2(){
        return new Outer2(){
            {ps = "inner outer2 ps";}
            public void method1() {
                println(ps);
            }
        };
    }

    public static void main(String[] args) {
        Outer2 o2 = new Outer2();
        o2.method1();
        Outer2 oi2 = o2.outer2();
        oi2.method1();  // why print "Outer2 ps?
    }
}



