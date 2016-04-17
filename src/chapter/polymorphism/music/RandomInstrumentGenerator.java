package chapter.polymorphism.music;

import java.util.Random;

/**
 * Created by kursk on 2016/4/1.
 */
public class RandomInstrumentGenerator {
    private Random rand = new Random(50);

    public Instrument next(){
        switch (rand.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Cookwind();
        }

    }
}
