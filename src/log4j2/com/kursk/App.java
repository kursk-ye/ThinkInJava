package log4j2.com.kursk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by kursk on 7/7/2017.
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        ConfigurationFactory factory = XmlConfigurationFactory.getInstance();
    }
}
