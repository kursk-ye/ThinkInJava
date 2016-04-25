package chapter.interfaces.page330.exe1;

/**
 * Created by kursk on 2016/4/25.
 */
public class Test {
    static void do1 (I1 i){
        i.method1_interface1();
    }

    static void do2 (I2 i){
        i.method1_interface2();
    }

    static void do3 (I3 i){
        i.method1_interface3();
    }

    static void do123 (I123 i){
        i.method1_interface123();
    }

    public static void main(String[] args) {
        ClassDo c= new ClassDo();
        do1(c);
        do2(c);
        do3(c);
        do123(c);
    }
}
