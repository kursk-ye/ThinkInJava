package log4j2;

import log4j2.com.ComApp;
import log4j2.com.soft.ComSoftApp;
import log4j2.net.NetApp;
import log4j2.net.soft.NetSoftApp;

/**
 * Created by yelei on 17-7-10.
 */
public class Test {

    public static void main(String[] args) {
        new ComApp();
        new ComSoftApp();
        new NetApp();
        new NetSoftApp();
    }
}
