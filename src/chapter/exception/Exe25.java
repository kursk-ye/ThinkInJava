package chapter.exception;

import static kursk.Kutils.println;

class Exception25A extends Exception{}
class Exception25B extends Exception25A{}
class Exception25C extends Exception25B{}

class A {
    void f() throws Exception25A {
        println("throw from A");
    }
}

class B extends A {
    @Override
    void f() throws Exception25B {
        println("throw from B");
    }
}

class C extends B {
    @Override
    void f() throws Exception25C {
        println("throw from C");
    }
}

public class Exe25 {
    public static void main(String[] args) {
        A a = new C();
        try{
            a.f();
        }catch (Exception25A e){
            e.printStackTrace(System.out);
        }
    }
}
