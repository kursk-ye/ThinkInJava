package chapter.holdyourobjects.exe14;

import java.util.LinkedList;
import java.util.ListIterator;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-13.
 */
public class Exe14 {
    static void addMiddle(LinkedList ls, Integer e){
        ListIterator it = ls.listIterator(ls.size()/2);
        it.add(e);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i =0; i<10; i++){
            addMiddle(list, i);
        }

        ListIterator it = list.listIterator();
        while (it.hasNext()){
            println(it.next());
        }
    }
}
