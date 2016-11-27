package org.vesinitsyn.gameroom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vladimirsinicyn on 26.11.16.
 */
@Configuration
@ComponentScan
public class ConfigurationClass {

    @Bean
    public GameDisc coolGame() {
        GameDisc disc = new PlayStation3BluRay();
        disc.setGame("Heroes 3");
        return disc;
    }
}
