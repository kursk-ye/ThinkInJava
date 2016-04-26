package chapter.interfaces.nesting;

/**
 * Created by kursk on 2016/4/26.
 */
public class C implements  I {
    public I getC(){return new C();}

    public static void main(String[] args) {
        C c = new C();
        I i= c.getC();
        C c2 = (C)c.getC();
    }
}
