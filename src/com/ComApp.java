package com;

/**
 * Created by kursk on 4/4/2017.
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComApp {
    public ComApp(){
        Logger logger = LogManager.getLogger(ComApp.class);
        logger.error("| NET :: LEVEL :: ComApp ERROR Message ::");
    }}
