package chapter.polymorphism.exec1;

import static kursk.Kutils.println;

/**
 * Created by kursk on 8/19/2017.
 */
class Glyph {
    void draw() { println("Glyph.draw()"); }
    Glyph() {
        println("Glyph() before draw()");
        draw();
        println("Glyph() after draw()");
    }
}
