package mate;

import mate.dao.BetDaoBetImpl;
import mate.dao.BetDaoBetInterface;
import org.reflections.Reflections;

import java.util.ServiceLoader;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        BetDaoBetInterface nnn = new BetDaoBetImpl();

        Reflections reflections = new Reflections("firstdeveloper.examples.reflections");
        Set<Class<? extends BetDaoBetInterface>> classes = reflections.getSubTypesOf(BetDaoBetInterface.class);

        System.out.println(classes);


    }

}
