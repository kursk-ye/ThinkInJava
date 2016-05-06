package chapter.innerclass.page350;

import chapter.innerclass.enclosing.*;
import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/29.
 */
public class HoldString {
    private String s = "123";
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence(10);
        for(int i=0; i<10; i++)
            seq.add(new HoldString());
        Selector sel = seq.selector();
        while (!sel.end()){
            print(sel.current() + " ");
            sel.next();
        }
    }
}
