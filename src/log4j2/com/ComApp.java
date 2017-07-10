package log4j2.com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by yelei on 17-7-10.
 */
public class ComApp {
    public ComApp(){
        Logger logger = LogManager.getLogger(ComApp.class);
        logger.error("COM :: LEVEL :: COMAPP CLASS ERROR MESSAGE :: "+ logger.getName());
    }
}
