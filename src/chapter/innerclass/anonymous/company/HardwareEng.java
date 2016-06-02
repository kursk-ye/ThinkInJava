package chapter.innerclass.anonymous.company;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/1.
 */
public class HardwareEng implements Developer {
    public static DevelopDepart depart= new DevelopDepart(){
        public Developer recruite(){
            return  new HardwareEng();
        }
    };

    @Override
    public void makeWare() {
        println("HardwareEng makeWare");
    }

    @Override
    public void coding() {
        println("HardwareEng coding");
    }
}
