package lang.print.gaps.task4;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


import org.slf4j.ILoggerFactory;

import java.util.logging.Logger;

public class SettingTypes {

//    private static final Logger log = LoggerFactory.getLogger(SettingTypes.class);
    private static final Logger loger = Logger.getLogger(SettingTypes.class.getName());
    public static void main(String[] args) {

            long first = 10_000_000_000L;
            loger.fine(String.valueOf(first));
            char second = 'a';
            loger.fine(String.valueOf(second));
            boolean third = 5 > 9;
            loger.fine(String.valueOf(third));
            double forth = 12.90434323324342;
            loger.fine(String.valueOf(forth));
            float fifth = 12.3F;
            loger.fine(String.valueOf(fifth));
            byte sixth = 1;
            loger.fine(String.valueOf(sixth));
            short seventh = 129;
            loger.fine(String.valueOf(seventh));


    }
}
