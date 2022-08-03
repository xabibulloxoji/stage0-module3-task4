package lang.print.gaps.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntRepresentation {

    private static final Logger log = LoggerFactory.getLogger(IntRepresentation.class);
    public static void main(String[] args) {
       try{
           int c = 99;
           System.out.println((char) c);
           int h = 102;
           System.out.println((char) h);
           int a = 97;
           System.out.println((char) a);
           int r = 114;
           System.out.println((char) r);
       } catch (Exception e){
           log.warn(e.getMessage());
       }
    }
}
