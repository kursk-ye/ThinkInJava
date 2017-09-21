package kursk.t2;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-8-16.
 */
public class Derived extends Super {
    public int mem = 1;

    public int getField() {
        return mem;
    }

    private void getSupField() {
        println("derived's super member :" + mem);
    }

    @Override
    void proxyGet() {
        super.proxyGet();
    }
}

