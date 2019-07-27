package mate.dao;

import mate.db.Storage;
import mate.lib.Dao;
import mate.model.User;

import java.util.List;

@Dao
public class BetDaoUserImpl implements BetDaoUserInterface {

    @Override
    public void add(User user) {
        Storage.users.add(user);
    }

    @Override
    public List<User> getAll() {
        return Storage.users;

    }
}
