package chapter.holdyourobjects.exe23;

import net.mindview.util.RandomGenerator;

import java.util.*;

import static kursk.Kutils.println;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(20);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        Integer max = 0;

        for (int i=0; i<1000; i++){
            Integer key = rand.nextInt(20);
            Integer count = m.get(key);
            m.put(key , count == null ? 1 : count+1);
        }

        Set<Map.Entry<Integer, Integer>> me = new HashSet<Map.Entry<Integer, Integer>>(m.entrySet());
        for(Map.Entry<Integer,Integer> e : me){
            max = (e.getValue() > max ? e.getValue() : max);
            println(e);
        }
        println( "max : " + max);
    }
}
