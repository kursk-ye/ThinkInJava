package log4j2.com.soft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by yelei on 17-7-10.
 */
public class ComSoftApp {
    public ComSoftApp(){
        Logger logger = LogManager.getLogger(ComSoftApp.class);
        logger.trace("COM :: COMSOFT :: LEVEL :: COMSOFTAPP CLASS ERROR MESSAGE"+ logger.getName());
    }
}
