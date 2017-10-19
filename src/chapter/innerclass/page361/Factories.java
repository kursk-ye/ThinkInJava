package chapter.innerclass.page361;

import static kursk.Kutils.*;

/**
 * Created by yelei on 17-9-21.
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1(){}
    public void method1(){println("Implemetation1 method1");}
    public void method2(){println("Implemetation1 method2");}
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    private Implementation2(){}
    public void method1(){println("Implemetation2 method1");}
    public void method2(){println("Implemetation2 method2");}
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class Factories {

    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}


