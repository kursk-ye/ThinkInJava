package chapter.typeinfo;

import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static kursk.Kutils.println;

abstract class Shape {
    void draw(){
        println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {return "Circle";}
}

class Square extends Shape {
    public String toString() {return "Square";}
}

class Rhomboid extends Shape {
    public String toString() {return "Rhomboid";}
}

class Triangle extends Shape {
    public String toString() {return "Triangle";}
}

public class Exe3 {
    public static void rotate(Shape s) {
        if(!(s instanceof Circle))
            println(s + " rotate");
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Rhomboid(), new Triangle()
        );
        for (Shape s : shapeList){
            rotate(s);
        }
    }
}
