package chapter.innerclass.ParentAndChild;

import java.util.ArrayList;
import java.util.List;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/6/8.
 */
public class Outter {
    public class Child extends Parent {
        private List<String> eventlist = new ArrayList<String>();
        public void start(String e){
            addEvent(e);
        }
        public String toChild() {
            String temp="";
            for(String e : eventlist) {
                temp += e;
            }
            return  temp;
        }
        public String toString() {
            String temp="";
            for(String e : eventlist) {
                temp += e;
            }
            return  temp;
        }
    }

    public static void main(String[] args) {
        Outter o = new Outter();
        Child c = o.new Child();
        c.start("one");
        c.start("two");
        c.start("three");
        println("toParent " + c.toParent());
        println("toChild " + c.toChild());
        println("toString " + c);   //implicit call toString method
    }
}
    // toParent onetwothree
    // toChild
    // toString
    // 这个例子说明,子类和父类同名的field是分类存放的，初始化时父类没有覆盖子类的field ，即evenlist
    // 通过子类的方法中调用父类的方法，将值保存到父类的evenlist中(子类有一个同名的evenlist)
    // 然后分别调用子类和父类的打印方法打印这个evenlist
    // 调用父类的打印方法时，可以看出父类eventlist存储值
    // 调用子类的打印方法时，可以看出子类eventlist 没有存储值
    // 调用子类的toString 方法也没有显示值，是因为子类的toString方法将父类的toString方法覆盖了，所以toString访问的是子类的eventlist
    // 这个方法说明：
    // [1]父类和子类的field是分类存储的，子类同名的field没有被父类覆盖
    // [2]实例初始化时，父类的方法初始化时绑定的scope是父类的field，子类的方法绑定的是子类的scope，除非子类同名的方法覆盖父类的方法
    // [3]子类的方法调用父类的方法，但是父类的方法绑定的是父类的scope，所以最终还是访问父类的field，子类同名的field实际是没有存储的




