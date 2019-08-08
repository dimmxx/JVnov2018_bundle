package conspect.lamba.German;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Bet> bets = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 13; i++){
            Bet bet = new Bet(random.nextInt(100), random.nextDouble());
            bets.add(bet);
        }

        System.out.println(bets);

//        bets.sort(new BetComparator());
//        System.out.println(bets);

//        bets.sort(new Comparator<Bet>() {
//            @Override
//            public int compare(Bet o1, Bet o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });

       // bets.sort((o1, o2) -> o1.getValue() - o2.getValue());

        //bets.sort(Comparator.comparingInt(Bet::getValue));
        //System.out.println(bets);

        //FunctionalInterface functionalInterface = () -> System.out.println("Hello world");

        FunctionalInterface <Bet> functionalInterface1 = (o) -> {

            System.out.println(o.getValue());
            System.out.println(o.getRisk());
            o.setValue(0);
            o.setRisk(0.0);
            System.out.println(o.getValue());
            System.out.println(o.getRisk());
            return o;
        };

        functionalInterface1.doSomething(bets.get(0));
        functionalInterface1.example();






    }



}
