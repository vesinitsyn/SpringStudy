package org.vesinitsyn.gameroom;

/**
 * Created by vladimirsinicyn on 26.11.16.
 */
public class PlayStation3BluRay implements GameDisc {

    private String game;

    public void startGame() {
        System.out.println("Now " + game + " is started!");
    }

    public void setGame(String game) {
        this.game = game;
    }
}
