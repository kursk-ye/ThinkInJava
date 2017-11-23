package chapter.holdyourobjects.exe1;

import java.util.ArrayList;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/22.
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int i){
        this.gerbilNumber = i;
    }

    public void hop(){
        println(this.gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gl = new ArrayList<Gerbil>();
        for(int i=0; i<10; i++)
            gl.add(new Gerbil(i));
        for(Gerbil g : gl)
            g.hop();
    }
}
