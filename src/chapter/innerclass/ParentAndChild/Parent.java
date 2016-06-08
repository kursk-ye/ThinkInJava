package chapter.innerclass.ParentAndChild;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kursk on 2016/6/8.
 */
public class Parent {
    private List<String> eventlist = new ArrayList<String>();
    public void addEvent(String e){
        eventlist.add(e);
    }
    public String toParent(){
        String temp="";
        for(String e : eventlist){
            temp += e;
        }
        return temp;
    }
    public String toString(){
        String temp="";
        for(String e : eventlist){
            temp += e;
        }
        return temp;
    }
}


