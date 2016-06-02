package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/31.
 */
public class Exe15_first {
    Exe15_first(){
        println("Exe15_first no argus");
    }

    Exe15_first(String str) {
        println("Exe15_first argus : " + str);
    }

    public static void main(String[] args) {
        Exe15_second es = new Exe15_second();
        es.getFirstArg("second");
        es.getFirstNoArg();
    }

}

class Exe15_second {
    Exe15_first getFirstNoArg(){
        return new Exe15_first(){

        };
    }

    Exe15_first getFirstArg(String str){
        return new Exe15_first(str){};
    }
}

