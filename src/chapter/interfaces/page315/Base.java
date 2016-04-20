package chapter.interfaces.page315;

/**
 * Created by kursk on 2016/4/17.
 */
public abstract class Base {
    abstract void print();
    Object add(int i){ return i;};
}

class Derived  extends Base{
    private int i=123;
    void  print(){
        System.out.print(i);
    }
    String add(int i){return  Integer.toString(i);}

    public static void main(String[] args) {
        Base d = new Derived();
        d.print();
    }
}
