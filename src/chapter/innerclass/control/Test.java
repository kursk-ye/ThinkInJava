package chapter.innerclass.control;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/6.
 */
public class Test extends Event {

    public void action(){
        Test t = new Test(1000);
        println(t.delayTime);
    }

    public Test(long j){
        super(j);
    }

    public static void main(String[] args) {
        long delay = 1000;
        Test e = new Test(delay);
        e.action();

    }
}
