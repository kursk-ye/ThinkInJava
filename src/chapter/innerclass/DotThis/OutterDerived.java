package chapter.innerclass.DotThis;

/**
 * Created by kursk on 2016/5/6.
 */
 class OutterDerived extends Outter {
    public static void main(String[] args) {
        Outter o = new Outter();
        Outter.Inner oi = o.new Inner();
    }
}
