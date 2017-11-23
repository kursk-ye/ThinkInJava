package chapter.holdyourobjects.page287;

import chapter.typeinfo.pets.Pet;
import chapter.typeinfo.pets.Pets;

import java.util.*;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-9.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while(it.hasNext()){
            Pet p = it.next();
            println(p.id() + ":" + p +" ");
        }
        println("********************");
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }

}
