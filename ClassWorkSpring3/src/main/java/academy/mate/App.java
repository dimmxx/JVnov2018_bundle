package academy.mate;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Dota2Config.class);
		context.refresh();
		Hero hero = context.getBean(Hero.class);
		System.out.println(hero);
    }
}
