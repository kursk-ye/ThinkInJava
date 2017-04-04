/**
 * Created by kursk on 4/4/2017.
 */
package net.journaldev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NetJournalDevApp {
    public NetJournalDevApp(){
        Logger logger = LogManager.getLogger(NetJournalDevApp.class);
        logger.error("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::");
    }}
