package chapter.holdyourobjects.page283;

import chapter.typeinfo.pets.Pet;
import chapter.typeinfo.pets.Pets;

import java.util.List;
import java.util.Random;

/**
 * Created by kursk on 10/15/2017.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
    }
}
