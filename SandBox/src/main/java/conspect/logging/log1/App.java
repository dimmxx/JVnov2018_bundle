package conspect.logging.log1;

import conspect.logging.log1.utils.ClazzNameUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        PrinterFactory printerFactory = new PrinterFactory();
        logger.error("App = Error level made factory");
        logger.trace("App = Trace level made factory");
        Printer printer = printerFactory.getPrinter();
        printer.printMessage();



    }

}
