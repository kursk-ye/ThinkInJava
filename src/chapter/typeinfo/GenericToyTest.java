package chapter.typeinfo;

/**
 * Created by kursk on 1/14/2018.
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass =FancyToy.class;
        FancyToy ft = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Class<Toy> up2 = (Class<Toy>) ftClass.getSuperclass();
        Object o = up.newInstance();
        Object o2 = up2.newInstance();
    }
}

