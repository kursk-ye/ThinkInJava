package chapter.innerclass.anonymous.company;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/1.
 */
public class Programmer implements Developer {
    public static DevelopDepart depart = new DevelopDepart(){
        public Developer recruite(){
            return  new Programmer();
        }
    };

    @Override
    public void makeWare() {
        println("Programmer makeWare");
    }

    @Override
    public void coding() {
        println("Programmer coding");
    }
}
