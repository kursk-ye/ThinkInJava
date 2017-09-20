package chapter.innerclass.page360;

import chapter.innerclass.localinnerclass.Destination;
import static kursk.Kutils.*;

/**
 * Created by kursk on 9/20/2017.
 */
public class Parcel10 {
    public Destination destination( String dest,  float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100)
                    println("over budget!");
            }
            private String label = dest;
            public String readLabel(){return label;}
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 198.395f);
    }
}
