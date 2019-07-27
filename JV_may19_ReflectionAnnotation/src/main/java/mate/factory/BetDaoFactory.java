package mate.factory;

import mate.dao.BetDao;
import mate.dao.BetDaoImpl;

public class BetDaoFactory {

    private static BetDao INSTANCE;

    public static BetDao getBetDao(){

        if(INSTANCE == null){
            return new BetDaoImpl();
        }else{
            return INSTANCE;
        }
    }
}
