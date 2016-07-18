package chapter.holdyourobjects.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/18.
 */
public class ListFeatures2 {
    public static void main(String[] args) {
        Random rnd = new Random(50);
        List<Integer> ins = new ArrayList<Integer>();
        for(int i=0; i<10; i++)
            ins.add(rnd.nextInt(20));

        println("1: " + ins);

        Integer h =  rnd.nextInt(30);
        ins.add(h);
        println("2: " + ins);

        println("3: " + ins.contains(h));

        ins.remove(h);
        println("3.5: " + ins);

        Integer i = ins.get(3);
        println("4: " + i + " " + ins.indexOf(i));

        Collections.sort(ins);
        println("5: sorted " + ins);

        Collections.shuffle(ins, rnd);
        println("6: shuffled " + ins);
    }
}
