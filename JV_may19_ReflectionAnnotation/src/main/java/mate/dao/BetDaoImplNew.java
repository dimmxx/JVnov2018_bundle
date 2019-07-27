package mate.dao;

import mate.db.Storage;
import mate.lib.Dao;
import mate.lib.DaoNew;
import mate.model.Bet;
import mate.model.Model;
import mate.model.User;

import java.util.List;

@DaoNew
public class BetDaoImplNew implements BetDao {

    public void add(Model user) {
        Storage.users.add((User) user);
    }

    @Override
    public List<User> getAll() {
        return Storage.users;

    }
}
