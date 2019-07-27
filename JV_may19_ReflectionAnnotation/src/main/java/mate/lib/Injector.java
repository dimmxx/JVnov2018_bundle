package mate.lib;

import mate.App;
import mate.controller.ConsoleHandler;
import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoUserInterface;
import mate.factory.BetDaoBetFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {

        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoBetInterface> betDaoBetClass = BetDaoBetInterface.class;
        Class<BetDaoUserInterface> betDaoUserClass = BetDaoUserInterface.class;
        Class<App> appClass = App.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(null, BetDaoBetFactory.getBetDao());
            }
        }

        Field[] appFields = appClass.getDeclaredFields();
        for (Field field : appFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(null, BetDaoBetFactory.getBetDao());
            }
        }


    }


}
