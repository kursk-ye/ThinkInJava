package chapter.innerclass.page354;

import static kursk.Kutils.println;
/**
 * Created by kursk on 2016/5/10.
 */
public class Outer {
    private String field1 = "kursk";
    public void doField1(){
        println(field1);
    }

    public void doField2(){
        Inner i = new Inner();
        i.inDoFiled();
        println(i.in_str);
    }

    class Inner {
        private String in_str = "crystl";
        public void inDoFiled(){
            field1 = "yelei";
            doField1();
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.doField2();
        o.doField1();
    }
}
