package mate;

import mate.bd.UserDAO;
import mate.model.User;

import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        User user = new User("Dima", 30, true);
        UserDAO userDAO = new UserDAO();

        userDAO.saveStudent(user);










    }
}
