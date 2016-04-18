package chapter.interfaces.rodent;

import static kursk.Kutils.print;

/**
 * Created by kursk on 2016/4/17.
 */
public class RandomRodentGenerator {

}

class Gorbil implements Rodent {

     public void dig() {
        print("Gorbil dig");
    }

    public void eat() {
        print("Gorbil eat");
    }
}

class Hamster implements Rodent {
     public void dig() {
        print("Hamster dig");
    }

    public void eat() {
        print("Hamster eat");
    }
}
