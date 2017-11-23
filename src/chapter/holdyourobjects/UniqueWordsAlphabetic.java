package chapter.holdyourobjects;

import tij4.net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

import static kursk.Kutils.println;


/**
 * Created by yelei on 17-11-15.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("MapOfList.java"));
        println(words);
    }
}
