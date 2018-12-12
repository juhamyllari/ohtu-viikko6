package ohtu.kivipaperisakset;

public class HumanVsHuman extends AbstractGame {

    @Override
    protected Player getPlayer(int playerNumber) {
        if (playerNumber == 1 || playerNumber == 2) {
            return new HumanPlayer(playerNumber);
        } else {
            throw new IllegalArgumentException("Invalid player number");
        }
    }
}
