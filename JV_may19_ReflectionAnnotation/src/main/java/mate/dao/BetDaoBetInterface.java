package mate.dao;

import mate.model.Bet;

import java.util.List;

public interface BetDaoBetInterface {

   void add(Bet bet);
   List<Bet> getAll();


}
