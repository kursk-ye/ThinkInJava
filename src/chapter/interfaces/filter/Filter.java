package chapter.interfaces.filter;

/**
 * Created by kursk on 2016/4/20.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }

}






