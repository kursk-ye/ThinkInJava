package chapter.holdyourobjects.exe9;


import java.util.ArrayList;
import java.util.Iterator;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-9.
 */
public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;

    public void add(Object x) {
        items.add(x);
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence();
        for(int i=0; i<10; i++) seq.add(Integer.toString(i));
        Iterator<Object> it = seq.items.iterator();
        while(it.hasNext()){
            println(it.next());
        }
    }
}
