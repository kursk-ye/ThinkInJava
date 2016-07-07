package chapter.holdyourobjects.exe2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static kursk.Kutils.print;

/**
 * Created by kursk on 2016/7/5.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c =new HashSet<Integer>();
        for(int i = 0; i<10; i++)
            c.add(i);
        for(Integer i : c)
            print(i + ",");
    }
}
