package chapter.interfaces.collisions;

/**
 * Created by kursk on 2016/4/25.
 */
interface I1 { void f(); }
interface I2 { int f(int i); }
interface I3 { int f(); }

public class C { public int f() { return 1; } }

class C2 implements I1, I2 {
    public void f() {}
    public int f(int i) { return 1; } // overloaded
}

class C3 extends C implements I2 {
    public int f(int i) { return 1; } // overloaded
}

class C4 extends C implements I3 {
    // Identical, no problem:
    public int f() { return 1; }
}

/*class C5 extends C implements I1 {
    public int f(){

    }
}*/
