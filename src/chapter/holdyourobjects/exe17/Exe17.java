package chapter.holdyourobjects.exe17;

import chapter.holdyourobjects.exe1.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

/**
 * Created by kursk on 11/23/2017.
 */
public class Exe17 {
    public static void main(String[] args) {
        String s;

        Map<String , Gerbil> map = new TreeMap<>();

        map.put("g"+ 7 , new Gerbil(1));
        map.put("g"+ 3 , new Gerbil(2));
        map.put("g"+ 5 , new Gerbil(3));
        map.put("g"+ 6 , new Gerbil(3));
        map.put("g"+ 2 , new Gerbil(3));

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()){
            s = it.next();
            print(s);
            print(" : ");
            map.get(s).hop();
        }
    }
}
