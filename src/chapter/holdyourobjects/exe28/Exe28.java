package chapter.holdyourobjects.exe28;

import chapter.holdyourobjects.exe22.Exe22;

import java.util.PriorityQueue;
import java.util.Random;

import static kursk.Kutils.println;

public class Exe28 {
    private PriorityQueue<Obj>  pq ;

    Exe28(){
        pq = new PriorityQueue<Obj>();
    }

    void offerObj(){
        for (int i=0; i<20; i++){
            pq.offer(new Obj());
        }
    }

    void dispaly(){
        while ( pq.peek() != null) {
            println(pq.poll());
        }
    }
    public static void main(String[] args) {
        Exe28 e = new Exe28();
        e.offerObj();
        e.dispaly();
    }

    class Obj extends  Object {

    }
}
