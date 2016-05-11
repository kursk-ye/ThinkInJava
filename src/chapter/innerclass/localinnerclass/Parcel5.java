package chapter.innerclass.localinnerclass;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/10.
 */
public class Parcel5 {
    private String vehicle = "train";
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
                vehicle = "car";
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        println(p.vehicle);
        Parcel5 p2 = new Parcel5();
        println(p2.vehicle);
    }
}
