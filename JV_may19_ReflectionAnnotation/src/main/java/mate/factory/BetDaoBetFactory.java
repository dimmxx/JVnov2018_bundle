package mate.factory;

import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoBetImpl;

public class BetDaoBetFactory {

    private static BetDaoBetInterface INSTANCE;

    public static BetDaoBetInterface getBetDao(){

        if(INSTANCE == null){
            return new BetDaoBetImpl();
        }else{
            return INSTANCE;
        }
    }
}
