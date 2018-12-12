package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class AbstractGame implements Game {

    private static final Scanner scanner = new Scanner(System.in);
    Player player1;
    Player player2;

    @Override
    public void play() {
        this.player1 = getPlayer(1);
        this.player2 = getPlayer(2);
        
        Judge judge = new Judge();

        while (true) {
            String playerOneMove = getMove(1);
            if (!legalMove(playerOneMove)) {
                break;
            }
            String playerTwoMove = getMove(2);
            if (!legalMove(playerTwoMove)) {
                break;
            }
            judge.judgeRound(playerOneMove, playerTwoMove);
            System.out.println(judge);
            update(playerOneMove, playerTwoMove);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(judge);
    }

    private boolean legalMove(String move) {
        return move.equals("k") || move.equals("p") || move.equals("s");
    }

    protected String getMove(int i) {
        switch (i) {
            case 1:
                return player1.move();
            case 2:
                return player2.move();
            default:
                throw new IllegalArgumentException("Unknown player");
        }
    }

    protected void update(String playerOneMove, String playerTwoMove) {
        player1.update(playerTwoMove);
        player2.update(playerOneMove);
    }
    
    protected abstract Player getPlayer(int playerNumber);

}
