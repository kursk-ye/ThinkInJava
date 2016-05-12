package chapter.innerclass.localinnerclass;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/12.
 */
public class Coder {
    public class office implements Building {
        public void role(){
            println("coder coding in office");
        }
    }

    public Building getOffice(){
        return new office();
    }
}
