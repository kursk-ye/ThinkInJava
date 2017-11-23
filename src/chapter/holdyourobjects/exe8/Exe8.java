package chapter.holdyourobjects.exe8;

import chapter.holdyourobjects.exe1.Gerbil;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yelei on 17-11-9.
 */
public class Exe8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> al = new ArrayList<Gerbil>();
        for(int i=0; i<10; i++) al.add(new Gerbil(i));
        Iterator<Gerbil> it = al.iterator();
        while (it.hasNext()){
            Gerbil g = it.next();
            g.hop();
        }
    }
}
