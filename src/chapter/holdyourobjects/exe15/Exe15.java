package chapter.holdyourobjects.exe15;

import java.util.Stack;
import static kursk.Kutils.*;


/**
 * Created by kursk on 11/13/2017.
 */
public class Exe15 {
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<Character>();
        sc.push('U');
        sc.push('n');
        sc.push('c');
        println(sc.pop());
        println(sc.pop());
        println(sc.pop());
        sc.push('e');
        sc.push('r');
        sc.push('t');
        println(sc.pop());
        println(sc.pop());
        println(sc.pop());
        sc.push('a');
        sc.push('i');
        sc.push('n');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push(' ');
        System.out.print(sc.pop());
        sc.push('r');
        sc.push('u');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('l');
        sc.push('e');
        sc.push('s');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
    }
}
