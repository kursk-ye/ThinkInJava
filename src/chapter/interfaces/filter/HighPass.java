package chapter.interfaces.filter;

/**
 * Created by kursk on 2016/4/20.
 */
public  class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
} ///:~
