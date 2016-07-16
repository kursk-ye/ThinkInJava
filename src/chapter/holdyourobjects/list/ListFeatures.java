package chapter.holdyourobjects.list;

import java.util.*;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

/**
 * Created by kursk on 7/16/2016.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(30);
        List<Pet> pets = new ArrayList<>();
        println("1 " + pets);

        Hamster h = new Hamster();
        pets.add(h);
        println("2 " + pets);
        println("3 " + pets.contains(h));

        //pets.remove(h);
        //Pet p = pets.get(1);
        //println(pets);

        Hamster h2 = new Hamster();
        pets.add(h2);

        println("4 " + pets.indexOf(h2));

        Cymric c = new Cymric();
        println("5 " + pets.indexOf(c));
        println("6 " + pets.remove(c));

/*        Pet p = pets.get(0);
        println(p);
        println(pets);
        println("7 " + pets.remove(p));
        println("8 " + pets);*/

        pets.add(1, new Mouse());
        pets.add(new Mouse());
        println("9 " + pets);

        List<Pet> sub = pets.subList(1,4);
        println("sublist: " + sub);
        println("pets: " + pets);
        println("10 " + pets.containsAll(sub));
        Collections.sort(sub);

        Collections.shuffle(sub, random);
        println("shuffled list: " + sub);
        println("12 " + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<Pet>(pets);
        println("pets: " + pets);
        sub = Arrays.asList(pets.get(1),pets.get(3));
        println("sub: " + sub);
        copy.retainAll(sub);
        println("13: " + copy);

        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        println("14: " + copy);

        copy.retainAll(sub);
        println("15: " + copy);

        copy.set(0, new Mouse());
        println("16: " + copy);

        copy.addAll(0, sub);
        println("17: " + copy);

        println("18: " + pets.isEmpty());

/*        pets.clear(); // Remove all elements
        println("19: " + pets);
        println("20: " + pets.isEmpty());*/

        Object[] o = pets.toArray();
        println("22: " + o[0]);

        Pet[] pa = pets.toArray(new Pet[1]);
        println("23 " + pa.length);
    }
}
