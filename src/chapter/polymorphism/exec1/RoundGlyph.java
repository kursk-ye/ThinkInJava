package chapter.polymorphism.exec1;

import static kursk.Kutils.println;

/**
 * Created by kursk on 8/19/2017.
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        println("RoundGlyph.draw(), radius = " + radius);
    }
}
