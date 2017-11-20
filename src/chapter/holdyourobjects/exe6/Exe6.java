package chapter.holdyourobjects.exe6;

import java.util.*;

import  static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-3.
 */
public class Exe6 {

    static List<String> initList(int length){
        Random rand = new Random(20);
        List<String> list1 = new ArrayList<String>();
        for(int i=0; i < length; i++){
            list1.add("var" + rand.nextInt(20));
        }
        return list1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<String> list1 = initList(10);

        println("list1: " + list1);

        list1.add("var100");
        println("2: " + list1);

        println("3: " + list1.contains(5));

        println("4: 5 is " + list1.indexOf(5));

        println("5: location 2 is " + list1.get(2));

        println("6: " + list1.remove(6));

        println("list1 : " + list1);

        Integer i = new Integer(8);

        println("7: " + list1.remove(i));

        println("8: " + list1.add("var60"));
        println("9: " + list1);

        List<String> sub = list1.subList(1,5);
        println("10: sublist is" + sub);
        sub.add("var40");
        println("11: " + list1);
        println("11: sublist is " + sub);
        println("11: " + list1.containsAll(sub));

        Collections.shuffle(sub,rand);
        println("12: " + list1);
        println("12: " + sub);

        sub = Arrays.asList(list1.get(1) , list1.get(7) , list1.get(6));
        println("13: " + sub);
        List<String> copy = new ArrayList<String>(sub);
        println("13: " + copy);
        copy.remove(2);
        println("13: " + list1);
        println("13: " + sub);
        list1.retainAll(sub);
        println("14: " + list1);
    }
}
