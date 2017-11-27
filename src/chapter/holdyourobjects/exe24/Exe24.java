package chapter.holdyourobjects.exe24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import static kursk.Kutils.println;

public class Exe24 {
    public static void main(String[] args) {
        Map<String , Integer> map = new LinkedHashMap<String , Integer>();
        Random rand =  new Random(90);

        for (int i=0; i<10; i++){
            Integer v = rand.nextInt(20);
            map.put( v.toString(), v);
        }

        println(" map : " + map);


    }
}
