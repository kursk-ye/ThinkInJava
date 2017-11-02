package chapter.holdyourobjects.exe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/19.
 */
public class Exe5 {

    static List<Integer> initList(int length,int n) {
        Random rand = new Random(47);
        List<Integer> ltest = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            ltest.add(rand.nextInt(n));
        }
        return ltest;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list1 = initList(10,17);

        println("1: " + list1);

        list1.add(4);
        println("2: " + list1);

        println("3: " + list1.contains(5));

        println("4: 5 is " + list1.indexOf(5));

        println("5: location 2 is " + list1.get(2));

        println("6: " + list1.remove(6));

        println("list1 : " + list1);

        Integer i = new Integer(8);

        println("7: " + list1.remove(i));

        println("8: " + list1.add(new Integer(20)));
        println("9: " + list1);

        List<Integer> sub = list1.subList(1,5);
        println("10: sublist is" + sub);
        sub.add(18);
        println("11: " + list1);
        println("11: sublist is " + sub);
        println("11: " + list1.containsAll(sub));

    }
}
