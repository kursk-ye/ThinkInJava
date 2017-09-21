package kursk.t1;

import kursk.t1.Parent;
import kursk.t1.Sun;

import static kursk.Kutils.println;

/**
 * Created by yelei on 17-8-16.
 */
public class Test {
    public static void main(String[] args) {
        Sun s = new Sun(); //sun shoot      parent run
        Parent p = new Sun(); //sun shoot      parent run
        println("******* sun class *******");
        s.move(s);
        println("******* parent class *******");
        p.move(p);
    }
}
