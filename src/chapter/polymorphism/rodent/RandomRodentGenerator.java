package chapter.polymorphism.rodent;

/**
 * Created by kursk on 4/2/2016.
 */
import java.util.*;

public class RandomRodentGenerator {
    private Random rand = new Random(47);
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Gorbil();
            case 2: return new Hamster();
        }
    }
}
