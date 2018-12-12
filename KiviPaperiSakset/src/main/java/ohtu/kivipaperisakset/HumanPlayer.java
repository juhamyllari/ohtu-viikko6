package ohtu.kivipaperisakset;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final int playerNumber;
    private final Scanner scanner;

    public HumanPlayer(int playerNumber) {
        this.playerNumber = playerNumber;
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public String move() {
        System.out.println("Pelaajan " + playerNumber + " siirto.");
        return scanner.nextLine();
    }

    @Override
    public void update(String otherMove) {
    }
    
}
