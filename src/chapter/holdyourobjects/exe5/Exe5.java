package chapter.holdyourobjects.exe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/19.
 */
public class Exe5 {
    private List<Integer> list;

    public Exe5(){
        list =new ArrayList<Integer>(Arrays.asList(10,21,97,1,4,75,120));
    }

    List getSub(int from, int to){
        return list.subList(from, to);
    }

    void removeSub(List sub){
        /*List temp = list;
        temp.removeAll(sub);
        list = temp;*/
        list.removeAll(sub);
    }

    void showList(){
        println(list);
    }
    public static void main(String[] args) {
        Exe5 e = new Exe5();
        e.showList();
        List s = e.getSub(1,3);
        e.removeSub(s);
        e.showList();
    }
}
