package chapter.innerclass.localinnerclass;

/**
 * Created by kursk on 2016/5/12.
 */
public class Test {
    public static void main(String[] args) {
        Coder c = new Coder();
        Building b = c.getOffice();
        b.role();
        ((Coder.office)b).role();
    }
}
