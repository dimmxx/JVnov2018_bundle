package mate.dao;

import mate.model.User;

import java.util.List;

public interface BetDaoUserInterface {

    void add(User user);
   List<User> getAll();


}
