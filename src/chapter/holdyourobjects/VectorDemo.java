package chapter.holdyourobjects;

import com.sun.org.apache.xpath.internal.functions.FuncSubstringAfter;

import java.util.*;
import static kursk.Kutils.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3, 2);
        println("Initial size:" + v.size());
        println("Initial Capacity:" + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        v.addElement(new Integer(5));
        println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(2.34));
        println("Current Capacity:" + v.capacity());

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        println("Current capacity: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());

        if(v.contains(new Integer(3)))
            System.out.println("Vector contains 3.");

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        v.removeAllElements();

        v.addElement(new String("abc"));
        v.addElement(new String("def"));
        v.addElement(new String("ghi"));
        v.addElement(new String("jkl"));
        println("Current capacity: " + v.capacity());
        println("Current size: " + v.size());
        println("def:" + v.indexOf("def"));

        Set<String> s = new HashSet<String>();
        s.add(new String("abc"));
        s.add(new String("def"));
        println("result:" + s.add(new String("abc")));
        println(s);

    }
}
