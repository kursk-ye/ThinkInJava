package chapter.innerclass.page353_a;

import chapter.innerclass.page353.Mobile;
import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/9.
 */
public class Auto {
    protected class  Automation implements Mobile {
        public void move() {
            println("car move");
        }

    }

    public Automation automation() {
        return new Automation();
    }
}
