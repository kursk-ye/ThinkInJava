package chapter.innerclass.page365;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by yelei on 17-9-21.
 */
interface Contents{
    int value();
}

interface Destination{
    String readLabel();
}

public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value(){return i;}
    }

    protected static class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        public String readLabel(){return label;}
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
