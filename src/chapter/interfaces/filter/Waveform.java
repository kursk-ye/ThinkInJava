package chapter.interfaces.filter;

/**
 * Created by kursk on 2016/4/20.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}
