package chapter.innerclass.page357;

import chapter.innerclass.DotThis.Parcel3;

/**
 * Created by kursk on 9/19/2017.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            public int value(){return i;}
        };
    }

    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c =p.contents();
    }
}

interface Contents{
    int value();
}
