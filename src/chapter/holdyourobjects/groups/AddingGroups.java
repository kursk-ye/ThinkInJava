package chapter.holdyourobjects.groups;

import java.util.*;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/8.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Collection<Integer> collection1 = new ArrayList<Integer>();
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection1, 11, 12, 13, 14, 15);
        Collections.addAll(collection1, moreInts);
        collection1.add(20);
        collection1.remove(7);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //list.add(2);
        println(collection);
        println(collection1);
        println(list);
    }
}
