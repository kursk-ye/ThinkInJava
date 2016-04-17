package chapter.polymorphism.pitfall;

/**
 * Created by kursk on 2016/4/11.
 */
class Super {
    public int field = 0;
    private int i = 0;

    public int getField() {
        return field ;
    }

    public  void  getSupField() {
        System.out.println("super field");
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public  void  getSubField() {
        System.out.println("sub field");
    }
}




public class FieldAccess {
    static int test(Super s) {
        return s.getField();
    }

    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast
        sup.getSupField(); // no sup.getSubField method
        System.out.println(test(sup));
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
/*        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());*/


    }
}
