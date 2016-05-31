package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/23.
 */
public class Student {
    Homework working(String cn) {
        return new Homework(cn) { //相当于继承了Homework这个父类，并重新了带参数的构造方法
            public String getClassname(){  //重写了getClassname这个方法

                return super.getClassname() + " & yuwen"; // super 调用父类
            }

            void doWork() {
                println("do " + this.getClassname() + " homework in home");
            }
        };
    }

    public static void main(String[] args) {
        Student s = new Student();
        Homework h = s.working("shuxue");    // 创建一个子类的实例
        h.doWork();                          // 这个实例有父类的方法
        println(h.getClassname());
    }
}

class Homework {
    private String classname;
    public String getClassname(){
        return this.classname;
    };
    void doWork() {
        println("do " + this.classname + " homework in class");
    }
    Homework(String cn){
        this.classname = cn;
    }
}
