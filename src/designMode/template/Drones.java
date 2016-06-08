package designMode.template;

/**
 * Created by kursk on 6/7/2016.
 */
public class Drones extends Controller {
    private long high;
    private long front;
    private long left;

    public class Rise extends Event {
        public Rise(long delay){
            super(delay);
        }
        public void action(){
            high += 10;
        }
        public String toString(){
            return "Drone rise !";
        }
    }

    public class Lower extends Event {
        public Lower(long delay) {super(delay);}
        public void action() {
            if (high > 0) {
                high -= 10;
            }
        }
        public String toString(){
            return "Drone lower !";
        }
    }

    public class Foward extends Event {
        public Foward(long delay) {super(delay);}
        public void action() {
            front += 10;
        }
        public String toString(){
            return "Drone foward !" ;
        }
    }

    public class Back extends Event {
        public Back(long delay) {super(delay);}
        public void action() {
            front -= 10;
        }
        public String toString() {
            return "Drone back !";
        }
    }

    public class Reset extends Event {
        private Event[] events;
        public Reset(long delay, Event[] events){
            super(delay);
            this.events = events;
            for( Event e : events){
                addEvent(e);
            }
        }
        public void action(){
            for( Event e : events){
                e.start();
                addEvent(e);
            }
            this.start();
            addEvent(this);
        }
    }
}
