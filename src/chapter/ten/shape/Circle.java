package chapter.ten.shape;

import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/3/28.
 */
public class Circle extends Shape {
    @Override
    public void draw() { print("Circle.draw()"); }

    @Override
    public void erase() { print("Circle.erase()"); }

    public void paint() { print("Circle.paint()"); }
} ///:~
