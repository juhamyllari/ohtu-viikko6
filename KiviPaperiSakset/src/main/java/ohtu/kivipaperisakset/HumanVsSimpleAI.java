package ohtu.kivipaperisakset;

public class HumanVsSimpleAI extends AbstractGame {

    @Override
    protected Player getPlayer(int playerNumber) {
        switch (playerNumber) {
            case 1:
                return new HumanPlayer(1);
            case 2:
                return new SimpleAI();
            default:
                throw new IllegalArgumentException("Invalid player number");
        }
    }


}
