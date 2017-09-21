package kursk.t2;

/**
 * Created by yelei on 17-8-16.
 */
class Super {
    public int mem = 0;
    private int i = 0;

    public int getField() {
        return mem;
    }

    private   void  getSupField() {
        System.out.println("super field :" + mem );
    }

    void proxyGet(){
        getSupField();
    }
}




