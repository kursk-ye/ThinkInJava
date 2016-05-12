package chapter.innerclass.localinnerclass;

import static kursk.Kutils.*;
/**
 * Created by kursk on 2016/5/11.
 */
public class Student {
    public Building studyInLocation(){
        class School implements Building {
            String color = "red";
            public void role(){
                println("student study in school");
            }
        }
        return new School();
    }

    public static void main(String[] args) {
        Student s = new Student();
        Building b = s.studyInLocation();
        b.role();
    }

}
