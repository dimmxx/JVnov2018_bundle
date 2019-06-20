package mate;


import mate.engine.HeroEngine;
import mate.model.Hero;
import mate.model.Item;

import java.util.List;

public class App {
    public static void main(String[] args) {

//        // Add a new hero
//        Hero hero = new Hero(0, "Jonh", 11);
//        HeroEngine heroEngine = new HeroEngine();
//        heroEngine.addHero(hero);
//

//        // Get a hero by id
//        HeroEngine heroEngine = new HeroEngine();
//        Hero hero = heroEngine.getHero(2L);
//        System.out.println(hero);



//        // Get all heroes
//        HeroEngine heroEngine = new HeroEngine();
//        List<Hero> allHeroes = heroEngine.getAllHeroes();
//        System.out.println(allHeroes);



        // Add a new hero with dependecy
        Hero hero = new Hero(0, "Jonh", 11);
        Item item = new Item("Boots of glory");
        hero.setItem(item);

        HeroEngine heroEngine = new HeroEngine();
        heroEngine.addHero(hero);







    }
}
