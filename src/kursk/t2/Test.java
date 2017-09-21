package kursk.t2;

/**
 * Created by yelei on 17-8-16.
 */
public class Test {

    public static void main(String[] args) {
        Super s = new Derived(); // Upcast
        s.proxyGet(); // no sup.getSubField method
    }
}
