package chapter.holdyourobjects;

import chapter.typeinfo.pets.*;

import java.util.*;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-11-16.
 */
public class MapOfList {
    public static Map<Pet, List<? extends Pet>> petPeople = new HashMap<Pet, List<? extends Pet>>();
    static {
        petPeople.put(new Dog("wang wang"), Arrays.asList(new Pug("jack"), new Mutt("jack 2")));
        petPeople.put(new Cat("miao miao"), Arrays.asList(new Manx("tom"), new EgyptianMau("tom 2")));
    }

    public static void main(String[] args) {
        println("petPeople : " + petPeople.keySet());
        println("petPeople values: " + petPeople.values());
        for(Pet p : petPeople.keySet()){
            println(p + ":" + petPeople.get(p));
        }
    }
}
