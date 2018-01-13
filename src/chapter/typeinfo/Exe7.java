package chapter.typeinfo;

import static kursk.Kutils.println;

class Candy {
    static { println("Loading Candy"); }
}

class Gum {
    static { println("Loading Gum"); }
}

class Cookie {
    static { println("Loading Cookie"); }
}

public class Exe7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            println("args not finded");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            println("enjoy your " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            c = Class.forName(args[1]);
            println("don't like " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
