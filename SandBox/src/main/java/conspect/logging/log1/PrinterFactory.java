package conspect.logging.log1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrinterFactory {

    private static final Logger logger = LogManager.getLogger(PrinterFactory.class);

    public Printer getPrinter() {
        logger.error("Printer factory = Error level entered getPrinter method");
        logger.trace("Printer factory = Trace level entered getPrinter method");
        return new Printer();
    }


}
