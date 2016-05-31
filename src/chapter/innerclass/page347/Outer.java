package chapter.innerclass.page347;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/29.
 */
public class Outer {
    private String s;
    public Outer(){
        s = "alphabet";
        println("new Outer2");
    }

     public class Inner {
        Outer getO(){
            return new Outer();
        }
        public String toString(){return s;}
    }

    public Inner getI(){
        return  new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.getI();
        //Inner i2 = new Outer2.Inner();
        print(i.toString());
    }
}


