package chapter.holdyourobjects.exe18;


import java.util.*;

import static kursk.Kutils.println;

/**
 * Created by kursk on 11/23/2017.
 */
public class Exe18 {
    public static void main(String[] args) {
        //String s;

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        map.put("e", "e");
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("ab","ab");

        println(map);

        Set<String> sortedKey = new TreeSet<String>(map.keySet());

        println(sortedKey);

        Map<String,String> sortedMap =  new LinkedHashMap<String,String>();

        for(String s : sortedKey ){
            sortedMap.put(s , map.get(s));
        }

        println(sortedMap);
    }
}
