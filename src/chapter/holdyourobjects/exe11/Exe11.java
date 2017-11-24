package chapter.holdyourobjects.exe11;

import java.util.*;

import static kursk.Kutils.println;

/**
 * Created by kursk on 11/9/2017.
 */
public class Exe11 {
    static void  display(Collection<String> c){
        Iterator<String> it = c.iterator();

        while(it.hasNext()){
            println(it.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>(10);

        for(int i=0 ; i<10; i++) c.add(i + "var");

        LinkedList<String> cLL = new LinkedList<String>(c);
        HashSet<String> cHS = new HashSet<String>(c);
        TreeSet<String> cTS = new TreeSet<String>(c);

        display(c);
        println("***********");
        display(cLL);
        println("***********");
        display(cHS);
        println("***********");
        display(cTS);

    }
}
