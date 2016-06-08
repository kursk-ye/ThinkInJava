package chapter.innerclass.exe26;

/**
 * Created by kursk on 2016/6/8.
 */
public class Second {
    public class Two extends First.One {
        public Two(First first,String str){
            first.super(str);
        }
    }

    public static void main(String[] args) {
        First f = new First();
        Second s =  new Second();
        Two t = s.new Two(f, "two");
    }
}
