package mate;

import mate.controller.ConsoleHandler;
import mate.dao.BetDao;
import mate.dao.BetDaoImpl;
import mate.factory.BetDaoFactory;
import mate.lib.Inject;
import mate.lib.Injector;

/**
 * Hello world!
 *
 */
public class App{

    static{
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private static BetDao betDao;

    public static void main( String[] args ){

        System.out.println( "Если хотите сделать ставку, \nвведите сумму и риск через пробел:" );

        ConsoleHandler handler = new ConsoleHandler();
        handler.handle();

        System.out.println(betDao.getAll());

    }
}
