package chapter.innerclass.localinnerclass;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/11.
 */
public class Worker {
    void working(boolean b){
        if(b) {
            for(int i=0; i<=10; i++){
                final int finalI = i;
                String s = "inner class";
                class Location implements Building {
                    public void role(){
                        //finalI必须使用final ,inner class访问外部socpe变量必须是final
                        println("worker working in " + finalI + " factory");
                    }
                }
                Location l = new Location();
                l.role();
            }
        }
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        w.working(true);
    }
}
