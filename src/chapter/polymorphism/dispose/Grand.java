package chapter.polymorphism.dispose;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/4/14.
 */
public class Grand {
    private Eat favorite;

    Grand(Eat e){
        this.favorite = e;
        print("Grand  is created");
    }

    protected void dispose(){
        favorite.dispose();
        print("Grand is dispose " + favorite);
    }
}
