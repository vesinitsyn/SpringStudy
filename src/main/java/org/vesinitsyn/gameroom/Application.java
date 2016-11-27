package org.vesinitsyn.gameroom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vladimirsinicyn on 26.11.16.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        GameConsole console = context.getBean(GameConsole.class);
        console.playGame();
    }
}
