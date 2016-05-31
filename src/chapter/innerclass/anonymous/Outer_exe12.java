package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/31.
 */
public class Outer_exe12 {
    private String outstr = "outer string";
    private void dislay(){
        println(outstr);
    }

    Int_inner inner(){
        return new Int_inner() {
            public void modify(){
                outstr = "inner string";
                dislay();
            }
        };
    }

    void initInner(){
        Int_inner oi = this.inner();
        oi.modify();
    }

    public static void main(String[] args) {
        Outer_exe12 oe12 = new Outer_exe12();
        oe12.initInner();
    }

}

interface Int_inner {
    void modify();
}
