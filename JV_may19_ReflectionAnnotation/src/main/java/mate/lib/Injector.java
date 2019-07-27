package mate.lib;

import mate.App;
import mate.controller.ConsoleHandler;
import mate.dao.BetDaoBetImpl;
import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoUserImpl;
import mate.dao.BetDaoUserInterface;
import mate.factory.BetDaoBetFactory;
import mate.factory.BetDaoUserFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {

        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoBetInterface> betDaoBetClass = BetDaoBetInterface.class;
        Class<BetDaoUserInterface> betDaoUserClass = BetDaoUserInterface.class;
        Class<App> appClass = App.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                if(field.getType().equals(BetDaoBetInterface.class)
                        && BetDaoBetImpl.class.isAnnotationPresent(Dao.class)){
                    field.setAccessible(true);
                    field.set(null, BetDaoBetFactory.getBetDao());
                }
                if(field.getType().equals(BetDaoUserInterface.class)
                        && BetDaoUserImpl.class.isAnnotationPresent(Dao.class)){
                    field.setAccessible(true);
                    field.set(null, BetDaoUserFactory.getBetDao());
                }
            }
        }

        Field[] appFields = appClass.getDeclaredFields();
        for (Field field : appFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                if(field.getType().equals(BetDaoBetInterface.class)
                        && BetDaoBetImpl.class.isAnnotationPresent(Dao.class)){
                    field.setAccessible(true);
                    field.set(null, BetDaoBetFactory.getBetDao());
                }
                if(field.getType().equals(BetDaoUserInterface.class)
                        && BetDaoUserImpl.class.isAnnotationPresent(Dao.class)){
                    field.setAccessible(true);
                    field.set(null, BetDaoUserFactory.getBetDao());
                }
            }
        }










    }


}
