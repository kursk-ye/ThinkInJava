package chapter.holdyourobjects.exe16;

import net.mindview.util.TextFile;

import java.lang.reflect.Array;
import java.util.*;

import static kursk.Kutils.println;

public class Exe16 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("MapOfList.java", "\\W+"));
        Set<Character> vowels = new TreeSet<Character>();
        Map<String, Integer> wordsMap = new TreeMap<String, Integer>();
        Integer vowelsCount = 0;

        List<String> list =  new ArrayList(words);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        for (String s : list) {
            Integer count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count++;
                    vowelsCount++;
                }
            }
            wordsMap.put(s, count);
        }
        println("vowelsCount :" + vowelsCount);
        println(wordsMap);


    }
}
