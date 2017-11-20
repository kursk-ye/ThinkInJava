package chapter.holdyourobjects;

import chapter.typeinfo.pets.Pet;
import chapter.typeinfo.pets.Pets;
import chapter.typeinfo.pets.Rat;

import java.util.LinkedList;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-13.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        println(pets);

        println(pets.getFirst());
        println(pets.element());

        println(pets.peek());

        println(pets.remove());
        println(pets.poll());

        pets.addFirst(new Rat());
        println(pets);
        pets.offer(Pets.randomPet());
        println(pets);

        pets.add(Pets.randomPet());
        println(pets);
    }
}
