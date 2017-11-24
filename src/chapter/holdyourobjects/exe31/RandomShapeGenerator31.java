package chapter.holdyourobjects.exe31;

import chapter.polymorphism.shape.Circle;
import chapter.polymorphism.shape.Shape;
import chapter.polymorphism.shape.Square;
import chapter.polymorphism.shape.Triangle;

import java.util.Iterator;
import java.util.Random;

import static kursk.Kutils.println;

/**
 * Created by kursk on 11/24/2017.
 */
public class RandomShapeGenerator31 implements Iterable<Shape> {
    private Random rand = new Random();

    public Shape make() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    private Shape[] shapes;

    RandomShapeGenerator31(int n) {
        shapes = new Shape[n];
        for(int i = 0; i < n; i++)
            shapes[i] = make();

    }

    public  Iterator<Shape> iterator(){
        return new Iterator<Shape>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        RandomShapeGenerator31 rsg = new RandomShapeGenerator31(20);
        for (Shape s : rsg)
            println(s);
    }
}
