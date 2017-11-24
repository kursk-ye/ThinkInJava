package chapter.holdyourobjects.exe22;

import net.mindview.util.TextFile;

import java.util.*;

import static kursk.Kutils.print;
import static kursk.Kutils.println;

public class Exe22 {

    List<Vowel> getVowel(Set<String> words){
        List<Vowel> vList = new ArrayList<Vowel>();
        Set<Character> vowels = new TreeSet<Character>();

        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        for (String s : words){
            Integer count = 0;
            Vowel v = new Vowel();
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    count++;
                }
            }
            v.setWord(s);
            v.setCount(count);
            vList.add(v);
        }

        return vList;
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("MapOfList.java", "\\W+"));
        List<Vowel> l = new ArrayList<Vowel>();

        Exe22 e = new Exe22();
        l = e.getVowel(words);

        for(int i=0; i<l.size(); i++){
            print(l.get(i).getWord() + ":");
            println(l.get(i).getCount());
        }

    }

    class Vowel{
        private String word;
        private Integer count;


        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }
}
