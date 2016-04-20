package chapter.interfaces.apply;

import java.util.Arrays;

/**
 * Created by kursk on 2016/4/20.
 */
public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);

}

class Upcase extends StringProcessor {
    public String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}
