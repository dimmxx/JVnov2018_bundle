package mate.dao;

import mate.db.Storage;
import mate.lib.Dao;
import mate.model.Bet;
import mate.model.Model;

import java.util.List;

@Dao
public class BetDaoImpl implements BetDao {

    public void add(Model bet) {
        Storage.bets.add((Bet)bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
