package chapter.ten.rodent;

import  static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/1.
 */
public class Rodent {
    void dig(){
        print("Rodent dig");
    }

    void eat(){
        print("Rodent eat");
    }
}

 class Mouse extends Rodent {
    void dig(){
        print("mouse dig");
    }

    void eat(){
        print("mouse eat");
    }
}

class Gorbil extends Rodent {

    void dig(){
        print("Gorbil dig");
    }

    void eat(){
        print("Gorbil eat");
    }
}

class Hamster extends Rodent {
    void dig(){
        print("Hamster dig");
    }

    void eat(){
        print("Hamster eat");
    }
}



