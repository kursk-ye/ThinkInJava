package chapter.innerclass.anonymous.carfactory;

/**
 * Created by kursk on 2016/6/1.
 */
public class CarFactory {
    public static void driver(CarManufacture manufacture) {
        Car c = manufacture.make();
        c.drive();
        c.move();
    }

    /**
     * Created by kursk on 2016/6/1.
     */
    public static void main(String[] args) {
        Hummer h = new Hummer();
        driver(h.manufacture);
    }
}


