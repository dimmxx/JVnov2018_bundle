package mate.dao;

import mate.db.Storage;
import mate.lib.Dao;
import mate.model.Bet;

import java.util.List;

@Dao
public class BetDaoBetImpl implements BetDaoBetInterface {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
