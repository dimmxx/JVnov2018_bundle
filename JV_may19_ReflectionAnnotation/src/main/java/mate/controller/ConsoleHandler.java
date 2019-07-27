package mate.controller;

import mate.dao.BetDaoBetImpl;
import mate.dao.BetDaoBetInterface;
import mate.dao.BetDaoUserImpl;
import mate.dao.BetDaoUserInterface;
import mate.lib.Inject;
import mate.model.Bet;
import mate.model.User;

import java.util.Scanner;

public class ConsoleHandler {

//    private static BetDaoBetInterface betDaoBet = new BetDaoBetImpl();
//    private static BetDaoUserInterface betDaoUser = new BetDaoUserImpl();

    @Inject
    private static BetDaoBetInterface betDaoBet;

    private static BetDaoUserInterface betDaoUser = new BetDaoUserImpl();

     public void handle(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if(command.equals("0")){
                scanner.close();
                return;
            }
            try {
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                String name = data[2];
                Bet bet = new Bet(value, risk);
                User user = new User(name);
                betDaoBet.add(bet);
                betDaoUser.add(user);
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Input error...");
            }
        }
    }
}
