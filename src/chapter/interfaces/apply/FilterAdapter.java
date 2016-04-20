package chapter.interfaces.apply;

import chapter.interfaces.filter.*;

/**
 * Created by kursk on 2016/4/20.
 */
public class FilterAdapter implements Processor {
    Filter filter;

    FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}

class FilterProcessor {
    public static void main(String[] args) {
        Apply.process(new FilterAdapter(new LowPass(100)), new Waveform());
        Apply.process(new FilterAdapter(new HighPass(200)), new Waveform());
        Apply.process(new FilterAdapter(new BandPass(100,200)), new Waveform());

    }
}