package chapter.polymorphism.dispose;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/14.
 */
public class Father extends Grand {
    private Eat favorite;

    Father(Eat e){ //wrong There is no default constructor available
        super(e);
        this.favorite = e;
        print("Father  is created");
    }

    protected void dispose(){
        favorite.dispose();
        super.dispose();
        print("Father is dispose " + favorite);
    }

    public static void main(String[] args) {
        Eat e = new Eat("apple");
        Father f = new Father(e);
        f.dispose();
    }

}
