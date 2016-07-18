package chapter.holdyourobjects.exe4;

import java.util.*;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/12.
 */
public class Generator {
    private int i=0;
    public String next(){
        switch(i) {
            default:
            case 0 : i++; return " The Shawshank Redemption";
            case 1 : i++; return "The Godfather";
            case 2 : i++; return " The Godfather: Part II";
            case 3 : i++; return "The Dark Knight";
            case 4 : i++; return "Schindler's List";
            case 5 : i++; return "The Lord of the Rings: The Return of the King";
            case 6 : i++; return " The Lord of the Rings: The Fellowship of the Ring";
            case 7 : i=0; return " Inception ";
        }
    }

    public Collection fill(Collection c, int n){
        for(int i=0; i<n ;i++) c.add(next());
        return c;
    }

    public static void main(String[] args) {
        Generator g = new Generator();
        println(g.fill(new ArrayList<String>(), 10));
        println(g.fill(new LinkedList<String>(), 10));
        println(g.fill(new HashSet<String>(), 10));
        println(g.fill(new LinkedHashSet<String>(), 10));
    }
}
