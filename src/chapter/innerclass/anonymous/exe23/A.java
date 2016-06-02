package chapter.innerclass.anonymous.exe23;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/2.
 */
public class A {
    public U makeU() {
        return new U(){
            public void method1(){
                println("A method1");
            }
            public void method2(){
                println("A method2");
            }
            public void method3(){
                println("A method3");
            }
            public String toString(){
                return "I'm a U";
            }
        };
    }
}
