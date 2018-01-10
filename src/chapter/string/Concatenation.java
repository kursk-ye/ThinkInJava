package chapter.string;

import static kursk.Kutils.println;

public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango +"def" + 47;
        println(s);
    }
}
