package betaPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

    private static Logger log = LogManager.getLogger(Demo1.class.getName());

    public static void main(String[] args){

        log.debug("I have clicked on button");
        log.info("Button is displayed");
        log.error("Button did not work");
        log.fatal("Button is missing");
    }

}
