package chapter.innerclass.DotThis;

/**
 * Created by kursk on 2016/5/6.
 */
public class DotThis {
    void f() { System.out.println("DotThis.f()"); }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner’s "this"
        }
    }
    public Inner inner() { return new Inner(); }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner(); //通过一个Outer class的方法得到inner class的实例
        dti.outer().f();

    }
}
