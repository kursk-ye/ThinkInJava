package designMode.factory;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/1.
 */
public class Peugeot implements Car {
    public CarManufacture manufacture = new CarManufacture(){
        public Car make(){
            return new Peugeot();
        }
    };

    @Override
    public void move() {
        println("Peugeot move");
    }

    @Override
    public void drive() {
        println("Peugeot drive");
    }


}
