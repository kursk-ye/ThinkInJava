package chapter.polymorphism;
/**
 * Created by kursk on 2016/3/28.
 */
public class Cycle {
    String name;

    static void ride(Cycle c){
        System.out.println(c.name);
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(t);
    }

}

class Unicycle extends Cycle{
    Unicycle(){
        this.name = "Unicycle";
    }
}

class Bicycle extends  Cycle{
    Bicycle(){
        this.name = "Bicycle";
    }
}

class Tricycle extends Cycle{
    Tricycle(){
        this.name = "Tricycle";
    }
}

