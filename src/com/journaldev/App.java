package com.journaldev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

public class App{
    public static void main( String[] args ) throws FileNotFoundException, IOException {

        // Get instance of configuration factory; your options are default ConfigurationFactory, XMLConfigurationFactory,
        //     YamlConfigurationFactory & JsonConfigurationFactory
        ConfigurationFactory factory =  XmlConfigurationFactory.getInstance();

        // Locate the source of this configuration, this located file is dummy file contains just an empty configuration Tag
        ConfigurationSource configurationSource = new ConfigurationSource(new FileInputStream(new File("F:\\CodeSpace\\log4j2Test\\conf\\configuration.xml")));

        // Get context instance
        LoggerContext context = new LoggerContext("JournalDevLoggerContext");

        // Get a reference from configuration
        Configuration configuration = factory.getConfiguration(context,configurationSource);

        // Create default console appender
        ConsoleAppender appender = ConsoleAppender.createDefaultAppenderForLayout(PatternLayout.createDefaultLayout());

        // Add console appender into configuration
        configuration.addAppender(appender);

        // Create loggerConfig
        LoggerConfig loggerConfig = new LoggerConfig("com",Level.FATAL,false);

        // Add appender
        loggerConfig.addAppender(appender,null,null);

        // Add logger and associate it with loggerConfig instance
        configuration.addLogger("com", loggerConfig);

        // Start logging system
        context.start(configuration);

        // Get a reference for logger
        Logger logger = context.getLogger("com");

        // LogEvent of DEBUG message
        logger.log(Level.FATAL, "Logger Name :: "+logger.getName()+" :: Passed Message ::");

        // LogEvent of Error message for Logger configured as FATAL
        logger.log(Level.ERROR, "Logger Name :: "+logger.getName()+" :: Not Passed Message ::");

        // LogEvent of ERROR message that would be handled by Root
        logger.getParent().log(Level.ERROR, "Root Logger :: Passed Message As Root Is Configured For ERROR Level messages");
    }}