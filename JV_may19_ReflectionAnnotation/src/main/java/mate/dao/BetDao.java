package mate.dao;

import mate.model.Bet;
import mate.model.Model;

import java.util.List;

public interface BetDao {

   void add(Model model);
   List<?> getAll();


}
