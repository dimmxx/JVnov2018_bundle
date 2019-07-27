package mate.controller;

import mate.dao.BetDao;
import mate.dao.BetDaoImpl;
import mate.factory.BetDaoFactory;
import mate.lib.Inject;
import mate.model.Bet;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static BetDao betDao;

    public void handle(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if(command.equals("0")){
//                scanner.close();
//                System.out.println(betDao.getAll());
//                System.exit(0);
                return;
            }
            try {
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            } catch (Exception E){
                System.out.println("Input error...");
            }
        }
    }
}
