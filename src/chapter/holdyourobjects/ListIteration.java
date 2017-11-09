package chapter.holdyourobjects;

import chapter.typeinfo.pets.Pet;
import chapter.typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

import static kursk.Kutils.*;

/**
 * Created by kursk on 11/10/2017.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while(it.hasNext())
            println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + ";");
        println(" ");
        while (it.hasPrevious())
            println(  ":" + it.previous().id());
        println(" ");
    }
}
