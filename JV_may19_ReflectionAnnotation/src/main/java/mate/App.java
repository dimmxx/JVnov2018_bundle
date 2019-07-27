package mate;

import mate.controller.ConsoleHandler;
import mate.dao.BetDaoBetImpl;
import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoUserImpl;
import mate.dao.BetDaoUserInterface;
import mate.lib.Inject;
import mate.lib.Injector;

public class App{

    static{
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private static BetDaoBetInterface betDaoBet;

    @Inject
    private static BetDaoUserInterface betDaoUser;

    public static void main( String[] args ){

        System.out.println( "Если хотите сделать ставку, \nвведите сумму и риск через пробел:" );

        ConsoleHandler handler = new ConsoleHandler();
        handler.handle();

        System.out.println(betDaoBet.getAll());
        System.out.println(betDaoUser.getAll());

    }
}
