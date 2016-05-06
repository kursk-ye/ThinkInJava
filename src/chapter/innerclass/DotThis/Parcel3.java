package chapter.innerclass.DotThis;

/**
 * Created by kursk on 2016/5/6.
 */
public class Parcel3 {
    public class Contents {
        private int i = 11;
        public int value() { return i; }
    }

    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }

    static class From {
        private String label = "wuhan";
        String readLabel() { return label;}
    }

    public static void main(String[] args) {
        OutterDerived od = new OutterDerived();
    }


}
