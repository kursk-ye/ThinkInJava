package kursk.t1;

/**
 * Created by yelei on 17-8-15.
 */
import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/4/8.
 */
public class Parent {
    void shoot(){
        println("parent shoot;");
    }

     void  run(){
        println("parent run;");
    }

    void  move(Parent t){
        t.shoot();
        t.run();
    }
}


