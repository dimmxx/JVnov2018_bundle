package academy.mate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Dota2Config {

    @Bean
    public Hero getHero() {
        return new Hero("Pudge", getItem());
    }

    @Bean
    public Item getItem() {
        return new Item("Sword of destiny");
    }




}
