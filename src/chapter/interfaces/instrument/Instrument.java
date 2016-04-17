package chapter.interfaces.instrument;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/17.
 */
public abstract class Instrument {
    private double speed = 2.34;
    public void add(){
        print("Instrument is add");
    }
    public void minus(){
        print("Instrument is minus");
    }

    public static void main(String[] args) {
        Instrument i = new Instrument(){

        };
    }
}
