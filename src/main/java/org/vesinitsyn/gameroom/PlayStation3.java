package org.vesinitsyn.gameroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vladimirsinicyn on 26.11.16.
 */
@Component
public class PlayStation3 implements GameConsole {

    private GameDisc disc;

    @Autowired
    public PlayStation3(GameDisc disc) {
        this.disc = disc;
    }

    public void playGame() {
        disc.startGame();
    }
}
