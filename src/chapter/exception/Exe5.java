package chapter.exception;

import static kursk.Kutils.println;

public class Exe5 {
    public static void main(String[] args) {
        int[] arr = new int[1];
        int i = 5;

        while (true){
            try {
                println(arr[i]);
                break;
            }catch (Exception e){
                e.printStackTrace(System.out);
            }
            i--;
        }
        println("excepiton is cross");
    }
}
