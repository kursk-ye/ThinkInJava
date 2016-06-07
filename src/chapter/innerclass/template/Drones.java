package chapter.innerclass.template;

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
            return "Drone rise !"
        }
    }

    public class Lower extends Event {
        public Lower()
    }
}
