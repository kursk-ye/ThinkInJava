/**
 * Created by kursk on 4/4/2017.
 */
package com.journaldev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComJournalDevApp {
    public ComJournalDevApp(){
        Logger logger = LogManager.getLogger(ComJournalDevApp.class);
        logger.debug("COM :: JournalDev :: LEVEL :: ComJournalDevApp debug Message ::");
    }}
