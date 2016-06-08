package designMode.template;

import java.util.ArrayList;
import java.util.List;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/7.
 */
public class Controller {
    private List<Event> eventlist = new ArrayList<Event>();
    public void addEvent(Event e){
        eventlist.add(e);
    }
    public void run(){
        while(eventlist.size() > 0){
            for(Event e : new ArrayList<>(eventlist)){
                if (e.ready()){
                    println(e);
                    e.action();
                    eventlist.remove(e);
                }
            }
        }
    }
}
