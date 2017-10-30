package chapter.holdyourobjects.exe4;

import java.util.*;

import static kursk.Kutils.*;

/**
 * Created by kursk on 10/14/2017.
 */
public class Generator {

    String next(int i){
        switch (i){
            default:
            case 0: return "The Shawshank Redemption (1994)";
            case 1: return "The Godfather (1972)";
            case 2: return "The Godfather: Part II (1974)";
            case 3: return "The Dark Knight (2008)";
            case 4: return "12 Angry Men (1957)";
            case 5: return "Schindler's List (1993)";
            case 6: return "Pulp Fiction (1994)";
            case 7: return "The Lord of the Rings: The Return of the King (2003)";
            case 8: return "The Good, the Bad and the Ugly (1966)";
            case 9: return "Fight Club (1999)";
            case 10: return "The Lord of the Rings: The Fellowship of the Ring (2001)";
        }
    }

    Collection fill(Collection c){
        int i;
        for(i=0; i<=10; i++) c.add(next(i));
        return c;
    }

    public static void main(String[] args) {
        Generator g = new Generator();
        println(g.fill(new ArrayList<>()));
        println(g.fill(new LinkedList<>()));
        println(g.fill(new HashSet<>()));
        println(g.fill(new LinkedHashSet<>()));
        println(g.fill(new TreeSet<>()));
    }

}
