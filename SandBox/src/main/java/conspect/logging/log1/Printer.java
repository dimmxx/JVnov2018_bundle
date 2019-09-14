package conspect.logging.log1;

import conspect.logging.log1.utils.ClazzNameUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Printer {

    private static final Logger logger = LogManager.getLogger(ClazzNameUtil.getCurrentClazzName());

    public void printMessage(){
        logger.error("Printer = Error level Printing message");
        logger.trace("Printer = Trace level Printing level");
        System.out.println("Hello world");
    }




}
