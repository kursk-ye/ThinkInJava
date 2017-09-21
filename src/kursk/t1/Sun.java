package kursk.t1;

import kursk.t1.Parent;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

/**
 * Created by yelei on 17-8-16.
 */
class Sun extends Parent {
    void shoot(){
        println("sun shoot;");
    }

    protected void run(){
        println("sun run;");
    }

    void  move(Sun t){
        println("method move be overload");
        t.shoot();
        t.run();
    }
}
