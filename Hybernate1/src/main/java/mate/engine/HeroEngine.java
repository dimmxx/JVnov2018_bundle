package mate.engine;

import mate.model.Hero;

import javax.persistence.*;
import java.util.List;

public class HeroEngine {

    private EntityManager entityManager =
            Persistence.createEntityManagerFactory("Dota2").createEntityManager();


    public void addHero(Hero hero) {

        entityManager.getTransaction().begin();
        entityManager.merge(hero);
        entityManager.getTransaction().commit();
    }


    public Hero getHero(Long id){
        return entityManager.find(Hero.class, id);
    }

    public List<Hero> getAllHeroes(){

        TypedQuery<Hero> namedQuery = entityManager.createNamedQuery("heroes.getAllHeroes", Hero.class);
        return namedQuery.getResultList();
    }



}
