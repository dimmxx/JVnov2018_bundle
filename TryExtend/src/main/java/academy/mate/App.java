package academy.mate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Human human = new Human();
        System.out.println(human.name);

        Student student = new Student();
        student.sayHello();
        System.out.println(student.name);

        System.out.println(human.name);


    }
}
