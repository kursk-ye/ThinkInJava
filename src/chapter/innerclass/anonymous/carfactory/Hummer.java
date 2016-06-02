package chapter.innerclass.anonymous.carfactory;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/1.
 */
public class Hummer implements Car {
    public CarManufacture manufacture = new CarManufacture(){
        public Car make(){
            return new Hummer();
        }
    };;

    @Override
    public void move() {
        println("Hummer move");
    }

    @Override
    public void drive() {
        println("Hummer drive");
    }


}
