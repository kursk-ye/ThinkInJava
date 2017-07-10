package log4j2.net.soft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by yelei on 17-7-10.
 */
public class NetSoftApp {
    public NetSoftApp(){
        Logger logger = LogManager.getLogger(NetSoftApp.class);
        logger.error("NET :: NETSOFT :: LEVEL :: NETSOFTAPP CLASS ERROR MESSAGE");
    }
}
