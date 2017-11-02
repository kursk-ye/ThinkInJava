package chapter.innerclass.page376;

//import org.apache.logging.log4j.core.config.ConfigurationFactory;

/**
 * Created by kursk on 9/22/2017.
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime){super(delayTime);}
        public void action(){light = true;}
        public String toString(){return "Light is on";}
    }

    public class LightOff extends Event {
        public LightOff(long delayTime){super(delayTime);}
        public void action(){
            light = false;
        }
        public String toString(){return "Light is off";}
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime){super(delayTime);}
        public void action(){ water = true;}
        public String toString(){ return "Greenhouse water is on";}
    }

}
