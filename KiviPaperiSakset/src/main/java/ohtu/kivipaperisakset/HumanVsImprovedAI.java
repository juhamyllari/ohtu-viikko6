package ohtu.kivipaperisakset;

public class HumanVsImprovedAI extends AbstractGame {

    @Override
    protected Player getPlayer(int playerNumber) {
        switch (playerNumber) {
            case 1:
                return new HumanPlayer(1);
            case 2:
                return new ImprovedAI(MainApp.IMPROVED_AI_MEMORY);
            default:
                throw new IllegalArgumentException("Invalid player number");
        }
    }

}
