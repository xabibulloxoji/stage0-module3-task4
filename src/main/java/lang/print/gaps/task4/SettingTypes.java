package lang.print.gaps.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SettingTypes {

    private static final Logger log = LoggerFactory.getLogger(SettingTypes.class);
    public static void main(String[] args) {

        try{
            long first = 10_000_000_000L;
            System.out.println(first);
            char second = 'a';
            System.out.println(second);
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
        } catch (Exception e){
            log.warn(e.getMessage());
        }


    }
}
