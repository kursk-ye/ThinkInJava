package chapter.interfaces.filter;

/**
 * Created by kursk on 2016/4/20.
 */
public  class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) { return input; }
}
