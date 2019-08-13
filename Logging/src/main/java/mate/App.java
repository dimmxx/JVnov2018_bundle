package mate;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App
{

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger userLogger = LogManager.getLogger(User.class);


    public static void main( String[] args ) {










        System.out.println( "Hello World!" );
    }
}
