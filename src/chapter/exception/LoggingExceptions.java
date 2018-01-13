package chapter.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import static kursk.Kutils.println;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e){
            println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e){
            println("Caught " + e);
        }
    }
}
