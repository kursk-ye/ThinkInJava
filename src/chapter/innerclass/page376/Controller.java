package chapter.innerclass.page376;

import java.util.ArrayList;
import java.util.List;

import static kursk.Kutils.*;

/**
 * Created by kursk on 9/22/2017.
 */
public class Controller {
    private List<Event> eventList= new ArrayList<Event>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        while(eventList.size() > 0)
            for(Event e: new ArrayList<Event>(eventList))
                if(e.ready()){
                    println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}
