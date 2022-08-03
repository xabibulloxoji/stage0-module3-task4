package lang.print.gaps.task4;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


import java.util.logging.Logger;

public class SettingTypes {

//    private static final Logger log = LoggerFactory.getLogger(SettingTypes.class);
    private static final Logger loger = Logger.getLogger(SettingTypes.class.getName());
    public static void main(String[] args) {

            long first = 10_000_000_000L;
            loger.fine(String.valueOf(first));
            char second = 'a';
            boolean third = 5 > 9;
            System.out.println(third);
            double forth = 12.90434323324342;
            System.out.println(forth);
            float fifth = 12.3F;
            System.out.println(fifth);
            byte sixth = 1;
            System.out.println(sixth);
            short seventh = 129;
            System.out.println(seventh);



    }
}
