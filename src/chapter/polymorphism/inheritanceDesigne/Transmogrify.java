package chapter.polymorphism.inheritanceDesigne;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/16.
 */
class Vehicle {
    protected int num;
    void move(){}
}

class Car extends Vehicle {
     int num;
    public void move(){
        print("car move");
    }
}

class Bus extends Vehicle {
    protected void move(){
        print("bus move");
    }
}

class Bicycle extends Vehicle {
    public void  move() {print("Bicycle move");}
    void  balance() {print("Bicycle balance");}
}

class City {
    private Vehicle v = new Car();
    public void change(){
        v = new Bus();
    }
    public void trans(){
        v.move();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Vehicle v[] = {new Car(),
                        new Bus(),
                        new Bicycle()};
        v[0].move();
        v[1].move();
        v[2].move();
        ((Bicycle)v[2]).balance();
        ((Bicycle)v[1]).balance();
    }
}
