package mate.lib;

import mate.App;
import mate.controller.ConsoleHandler;
import mate.dao.BetDao;
import mate.dao.BetDaoImpl;
import mate.factory.BetDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {

        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDao> betDaoClass = BetDao.class;

        Class<App> appClass = App.class;


        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields){
            if(field.getDeclaredAnnotations() != null){
                field.setAccessible(true);
                field.set(null, BetDaoFactory.getBetDao());
            }
        }

        Field[] appFields = appClass.getDeclaredFields();
        for (Field field : appFields){
            if(field.getDeclaredAnnotations() != null){
                field.setAccessible(true);
                field.set(null, BetDaoFactory.getBetDao());
            }
        }






    }


}
