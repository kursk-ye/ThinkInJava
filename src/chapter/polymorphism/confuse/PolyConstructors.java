package chapter.polymorphism.confuse;

import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/16.
 */
class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private long longSize = 2;
    private long shortSize = 1;

    RectangularGlyph(long longSize, long shortSize){
        print("RectangularGlyph.draw(), longSize is " + longSize + " , shortSize is " + shortSize);
    }

    void draw() {
        print("RectangularGlyph.draw(), longSize is " + longSize + " , shortSize is " + shortSize);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(10,5);
    }
}