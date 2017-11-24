package chapter.holdyourobjects.exe17;

import chapter.holdyourobjects.exe1.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

/**
 * Created by kursk on 11/23/2017.
 */
public class Exe17 {
    public static void main(String[] args) {
        String s;

        Map<String , Gerbil> map = new HashMap<>();

        map.put("g"+ 1 , new Gerbil(1));
        map.put("g"+ 2 , new Gerbil(2));
        map.put("g"+ 3 , new Gerbil(3));

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()){
            s = it.next();
            print(s);
            print(" : ");
            map.get(s).hop();
        }
    }
}
