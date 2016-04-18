package chapter.interfaces.rodent.mouse;

import chapter.interfaces.rodent.Rodent;

import static kursk.Kutils.print;

/**
 * Created by kursk on 2016/4/17.
 */
public class Mouse implements Rodent {


    public void dig() {
        print("mouse dig");
    }

    public void eat() {
        print("mouse eat");
    }
}
