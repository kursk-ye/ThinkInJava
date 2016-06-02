package chapter.innerclass.anonymous.exe23;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/2.
 */
public class B {
    private U[] us = null;

    public B(int i) {
        us = new U[i];
    }

    public void push(U u, int i){
        us[i] = u;
    }

    public void erase(int i) {
        us[i] = null;
    }

    public void show(){
        for(int j=0; j<us.length; j++){
            if (us[j] != null ){
                us[j].method1();
                us[j].method2();
                us[j].method3();
                println(j + " : " + us[j].toString());
            }
        }
    }
}
