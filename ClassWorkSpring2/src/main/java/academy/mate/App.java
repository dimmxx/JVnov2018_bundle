package academy.mate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Hero hero = (Hero) context.getBean("hero");
        System.out.println("Working...");
        System.out.println(hero);


    }
}
