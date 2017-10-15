package chapter.typeinfo.pets;

import java.util.*;

/**
 * Created by kursk on 10/15/2017.
 */
public class Pets {
    public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
} ///:~
