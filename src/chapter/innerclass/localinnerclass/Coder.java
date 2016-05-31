package chapter.innerclass.localinnerclass;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/12.
 */
public class Coder {
    private int i = 2;
    public class office implements Building {
        public void role(){
            println("coder coding in office" + i);
        }
    }

    public Building getOffice(){
        for (int j=0; j<=10; j++){
            final int finalJ = j;
            class Count {
                  void count() {
                      println("i:" + i);
                      println(finalJ);
                      // println(j);  //为什么for loop 循环的 j 必须同final方式
                  }
              }
        }
        return new office();
    }

    public static void main(String[] args) {
        Coder c = new Coder();
        c.getOffice();
    }
}
