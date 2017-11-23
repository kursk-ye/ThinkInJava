package chapter.holdyourobjects;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

import static kursk.Kutils.*;

/**
 * Created by kursk on 11/17/2017.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        println(words);
    }
}
