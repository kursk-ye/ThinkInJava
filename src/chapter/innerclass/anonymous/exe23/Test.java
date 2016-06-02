package chapter.innerclass.anonymous.exe23;

/**
 * Created by kursk on 2016/6/2.
 */
public class Test {
    public static void main(String[] args) {
        int len = 6;
        B b = new B(len);
        for (int i=0; i<len ;i++){
            b.push(new A().makeU() , i);
        }
        b.erase(2);
        b.show();
    }
}
