package chapter.typeinfo;

/**
 * Created by kursk on 1/14/2018.
 */
class Building {}
class House extends Building {}
class Factory extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        Factory f = (Factory)b;
        Factory f2 = (Factory.class).cast(b);
    }
}
