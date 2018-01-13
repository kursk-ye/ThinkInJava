package chapter.typeinfo;

import static kursk.Kutils.println;

/**
 * Created by kursk on 1/9/2018.
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {} // if not
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {super(1);}
}


public class ToyTest {
    static void printInfo(Class cc){
        println("Class name:" + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
    }
}
