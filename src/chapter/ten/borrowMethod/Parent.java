package chapter.ten.borrowMethod;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/8.
 */
public class Parent {
    private String name = "parent";

    public void move_public(){
        print("parent public move");
    }

    protected void move_protected(){
        print("parent protected move");
    }

    void move_package(){
        print("parent package move");
    }

    private void move_private(){
        print("parent private move");
    }

    protected void getName(){
        print(name);
    }


    public static void main(String[] args) {
        Sun s = new Sun();
        s.move_public();
        s.move_protected();
        s.move_package();

        Parent p = new Sun();
        p.move_public();
        p.move_protected();
        p.move_package();
        p.move_private();

        p.getName();

    }
}

class Sun extends Parent {
    private String name = "sun";
    private int age = 12;

    public void move_sun_public(){
        age = 15;
        print("sun move public");
    }

    protected void move_sun_protected(){
        print("sun move protected");
    }

     void move_sun_package(){
        print("sun move package");
    }

    private void move_sun_private(){
        print("sun move private");
    }

    protected void getName(){
        print(name);
        print(age);
    }
}