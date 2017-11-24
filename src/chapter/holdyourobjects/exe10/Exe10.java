package chapter.holdyourobjects.exe10;

import chapter.polymorphism.rodent.Rodent;

import java.util.ArrayList;
import java.util.Iterator;

import static kursk.Kutils.println;

/**
 * Created by kursk on 11/9/2017.
 */
public class Exe10 {
    public static void main(String[] args) {
        ArrayList<Rodent> al = new ArrayList<Rodent>(10);

        for(int i=0; i<10; i++) al.add(new Rodent());

        Iterator<Rodent> it = al.iterator();

        while (it.hasNext()){
            println(it.next());
        }

    }
}
