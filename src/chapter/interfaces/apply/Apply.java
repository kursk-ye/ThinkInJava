package chapter.interfaces.apply;

import static kursk.Kutils.println;


/**
 * Created by kursk on 2016/4/20.
 */

public class Apply {
    public static void process(Processor p, Object s) {
        println("Using Processor " + p.name());
        println(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        process(new Swaps(), s);
    }
}
