package chapter.exception;

import java.lang.reflect.Array;

public class Exe3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
            for(int i=0; i<=10; i++){
                arr[i]=i;
            }
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }

}
