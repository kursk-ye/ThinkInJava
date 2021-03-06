package chapter.holdyourobjects.exe25;

import net.mindview.util.TextFile;

import java.util.*;

import static kursk.Kutils.println;

public class Exe25 {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> m =  new LinkedHashMap<String,ArrayList<Integer>>();
        List<String> words = new LinkedList<String>();
        words.addAll(new TextFile("MapOfList.java", "\\W+"));
        println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = (String)itWords.next();
            count++;
            if(!m.keySet().contains(s)) {
                ArrayList<Integer> ai =                         new ArrayList<Integer>();
                ai.add(0, count);
                m.put(s, ai);
            }
            else {
                m.get(s).add(count);
                //m.put(s, m.get(s));
            }
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        Collections.addAll(l , 1,2,3,4);
        m.put("chapter", l);
        System.out.println("Map of word locations: " + m);
    }
}
