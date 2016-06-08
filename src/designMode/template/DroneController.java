package designMode.template;

/**
 * Created by kursk on 2016/6/8.
 */
public class DroneController {

    public static void main(String[] args) {
        Drones d = new Drones();
        Event[] events = {
                d.new Rise(100),
                d.new Rise(100),
                d.new Foward(100),
                d.new Back(1000)
        };
        Drones.Reset dr = d.new Reset(1000,events);
        d.run();
    }
}
