package chapter.innerclass.DotThis;

/**
 * Created by kursk on 2016/5/6.
 */
public class DotNew {
   public class Inner {}
   public static void main(String[] args) {
      DotNew p = new DotNew();
      DotNew.Inner di = p.new Inner();  //通过outer.new方式得到一个内部类的实例
   }
}

