package chapter.holdyourobjects.page283;

import chapter.typeinfo.pets.*;

import java.util.*;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

/**
 * Created by kursk on 10/15/2017.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        println("2: " + pets);
        println("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        println("4: " + p + " " + pets.indexOf(p));

        Pet cymric = new Cymric();
        println("5: " + pets.indexOf(cymric));
        println("6: " + pets.remove(cymric));

        println("7: " + pets.remove(p));
        println("8: " + pets);

        pets.add(3, new Mouse());
        println("9: " + pets);
        List<Pet> sub = pets.subList(1,4);
        println("subList:" + sub);
        sub.add(new Pet());
        println("10: pets " + pets);
        println("10: sub " + sub);
        Collections.sort(sub);
        println("sorted subList:" + sub);
        println("11 sorted: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        println("shuffled subList: " + sub);
        println("12: " + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        println("sub: " + sub);
        copy.retainAll(sub);
        println("13: " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        println("pets: " + pets);
        println("14:" + copy);
        copy.removeAll(sub);
        println("15: " +copy);

        copy.set(1, new Mouse());
        println("16: "+ copy);

        copy.addAll(2, sub);
        println("17: " + copy);
    }
}
