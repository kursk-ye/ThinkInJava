package chapter.innerclass.anonymous.company;

/**
 * Created by kursk on 2016/6/1.
 */
public class Company {
    static void  dev(DevelopDepart depart){
        Developer dever = depart.recruite();
        dever.coding();
        dever.makeWare();
    }

    public static void main(String[] args) {
        dev(Programmer.depart);
        dev(HardwareEng.depart);
    }
}
