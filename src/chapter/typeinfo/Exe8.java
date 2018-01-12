package chapter.typeinfo;

import java.lang.reflect.Field;

import static kursk.Kutils.println;

class p1 {
    private int p1_int;
    private String p1_string;
    void p_method(){}
}
class p2 extends p1 {
    private int p2_int;
    void p_method(){}
}
class p3 extends p1 {}
class p4 extends p2 {
    private String p4_String ;
    void p4_method(){}
}
class p5 extends p4 {
    private String p5_String;
    void p5_method(){}
}

public class Exe8 {
    public static void main(String[] args) {
        p1 o = new p5();
        Class c = null;
        c = o.getClass();
        while ( c != null){
            println(c);
            Field[] fs = c.getDeclaredFields();
            for (Field f : fs){
                println(f);
            }

            c = c.getSuperclass();
        }
    }
}
