package chapter.holdyourobjects.page287;

import chapter.typeinfo.pets.Pet;
import chapter.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

import  static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-7.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()){
            Pet p = it.next();
            println(p.id() + ":" + p + " ");
        }

        println("************************");

        for (Pet p : pets) println(p.id() + ":" + p + " ");

        println("************************");

        it = pets.iterator();
        for(int i=0 ; i < 6 ; i++) {
            it.next();
            it.remove();
        }
        println(pets);
    }
}
