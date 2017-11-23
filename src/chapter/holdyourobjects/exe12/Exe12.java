package chapter.holdyourobjects.exe12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import static kursk.Kutils.println;

/**
 * Created by kursk on 11/10/2017.
 */
public class Exe12 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 =  new ArrayList<Integer>(10);
        ArrayList<Integer> l2 =  new ArrayList<Integer>(10);

        for (int i=0; i<10; i++) l1.add(i);

        ListIterator<Integer> l2it = l2.listIterator();

        for(int j=l1.size()-1; j>=0; j--){
            l2it.add(l1.get(j));
        }

        while (l2it.hasPrevious())   println(l2it.previous());
    }
}
