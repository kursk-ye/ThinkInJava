package chapter.polymorphism.rodent;

import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/1.
 */
public class Rodent {
    private static RandomRodentGenerator rrg = new RandomRodentGenerator();

    void dig() {
        print("rodent dig");
    }

    void eat() {
        print("rodent eat");
    }

    public static void main(String[] args) {
        Rodent[] s = new Rodent[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = rrg.next();
        // Make polymorphic method calls:
        for (Rodent shp : s) {
            shp.dig();
        }
        if (0.1 + 0.2 == 0.3) {
            print("equal");
            ;
        } else {
            print("no equal");
        }

    }
}


class Mouse extends Rodent {


    void dig() {
        print("mouse dig");
    }

    void eat() {
        print("mouse eat");
    }
}

class Gorbil extends Rodent {

    void dig() {
        print("Gorbil dig");
    }

    void eat() {
        print("Gorbil eat");
    }
}

class Hamster extends Rodent {
    void dig() {
        print("Hamster dig");
    }

    void eat() {
        print("Hamster eat");
    }
}



