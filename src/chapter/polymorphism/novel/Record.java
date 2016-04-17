package chapter.polymorphism.novel;

/**
 * Created by kursk on 2016/4/14.
 */
public class Record {
    private String password = "888888";
    private void displayPd(){
        System.out.println(password);
    }


    public static void test(Record r){
        r.displayPd();
    }

    public static void main(String[] args) {
        Record ra = new Account();//upcast
        test(ra); // 888888
    }
}

class Account extends Record {
    private String password = "123456";
    private void displayPd(){
        System.out.println(password);
    }
}