import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


// Testing Logging
// Get it?

public class Wood {
 private static Logger logger = LogManager.getLogger(Wood.class);

    public static void main(String[] args) {
        System.out.printf("Hello World!");
        logger.info("Hi from logger");
        logger.error("ERROR from logger");

    }


}
