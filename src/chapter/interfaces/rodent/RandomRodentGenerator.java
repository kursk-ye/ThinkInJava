package chapter.interfaces.rodent;

import static kursk.Kutils.print;

/**
 * Created by kursk on 2016/4/17.
 */
public class RandomRodentGenerator {

}

class Gorbil extends Rodent {

     public void dig() {
        print("Gorbil dig");
    }

    public void eat() {
        print("Gorbil eat");
    }
}

class Hamster extends Rodent {
     public void dig() {
        print("Hamster dig");
    }

    public void eat() {
        print("Hamster eat");
    }
}
