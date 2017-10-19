package chapter.holdyourobjects.page392;

import java.util.ArrayList;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-9-22.
 */
class Apple{}

class Orange{}

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i=0; i<3; i++)
            apples.add(new Apple());
        //apples.add(new Orange());
    }
}
