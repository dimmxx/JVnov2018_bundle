package mate.factory;

import mate.dao.BetDaoBetImpl;
import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoUserImpl;
import mate.dao.BetDaoUserInterface;

public class BetDaoUserFactory {

    private static BetDaoUserInterface INSTANCE;

    public static BetDaoUserInterface getBetDao(){

        if(INSTANCE == null){
            return new BetDaoUserImpl();
        }else{
            return INSTANCE;
        }
    }
}
