package chapter.holdyourobjects.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static kursk.Kutils.println;


/**
 * Created by kursk on 2016/7/20.
 * compare insert and access with arraylist and linkedlist
 */
public class Compare {
    private List<Integer> al;
    private List<Integer> ll;
    private int LENG;
    Long startTime;
    Long endTime;

    Compare(){
        LENG = 100000;
        Random rnd = new Random(90);
        al = new ArrayList<Integer>();
        startTime = System.nanoTime();
        for(int i=0; i<LENG; i++)  al.add(rnd.nextInt(10000));
        endTime = System.nanoTime();
        println("arraylist duration insert: " + (endTime - startTime));

        ll = new LinkedList<Integer>();
        startTime = System.nanoTime();
        for(int j=0; j<LENG; j++)  ll.add(rnd.nextInt(10000));
        endTime = System.nanoTime();
        println("linkedlist duration insert: " + (endTime - startTime));
    }

    void showAL(){
        startTime = System.nanoTime();
        for(int i=0; i<LENG; i++) al.get(i);
        endTime = System.nanoTime();
        println("arraylist duration access: " + (endTime - startTime));

        startTime = System.nanoTime();
        for(int i=0; i<LENG; i++) ll.get(i);
        endTime = System.nanoTime();
        println("linkedlist duration access: " + (endTime - startTime));
    }

    public static void main(String[] args) {
        Compare c = new Compare();
        c.showAL();
    }
}
