package log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws FileNotFoundException,IOException {
        ConfigurationFactory factory = XmlConfigurationFactory.getInstance();

        ConfigurationSource configurationSource=new ConfigurationSource(new FileInputStream(new File("/home/yelei/apache-tomcat-8.5.16/lib/log4j2.xml")));

        LoggerContext context = new LoggerContext("kurskContext");

        Configuration configuration = factory.getConfiguration(context,configurationSource);

        ConsoleAppender appender = ConsoleAppender.createDefaultAppenderForLayout(PatternLayout.createDefaultLayout());

        configuration.addAppender(appender);

        LoggerConfig loggerConfig = new LoggerConfig("com", Level.FATAL ,false);

        loggerConfig.addAppender(appender,null,null);

        configuration.addLogger("com",loggerConfig);

        //context.start(configuration);

        Logger logger = context.getLogger("kursk");

        logger.log(Level.FATAL,"Logger Name ::" + logger.getName() + ":: passed Message::");

        logger.log(Level.ERROR, "Logger Name ::" + logger.getName()+":: not passed message::");

        logger.getParent().log(Level.ERROR,"Root logger :: " + logger.getParent().getName());
    }
}