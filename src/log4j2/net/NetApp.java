package log4j2.net;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.nio.ch.Net;

/**
 * Created by yelei on 17-7-10.
 */
public class NetApp {
    public NetApp(){
        Logger logger = LogManager.getLogger(NetApp.class);
        logger.error("NET :: LEVEL :: NETAPP CLASS ERROR MESSAGE ::" + logger.getName());
    }
}
