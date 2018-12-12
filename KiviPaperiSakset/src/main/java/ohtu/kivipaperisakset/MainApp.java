package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApp {

    public static final int IMPROVED_AI_MEMORY = 20;

    private interface MenuOption {

        public void execute();

        public static MenuOption PlayHumanVersusHuman() {
            return () -> Game.humanVsHuman().play();
        }

        public static MenuOption PlayHumanVersusSimpleAI() {
            return () -> Game.humanVsSimpleAI().play();
        }

        public static MenuOption PlayHumanVersusImprovedAI() {
            return () -> Game.humanVsImprovedAI(IMPROVED_AI_MEMORY).play();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Map<String, MenuOption> menuOptions = getMenuOptions();

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetetaan");
            String input = scanner.nextLine();
            if (menuOptions.containsKey(input)) {
                System.out.println("peli loppuu kun pelaaja antaa "
                        + "virheellisen siirron eli jonkun muun kuin k, p tai s");
                menuOptions.get(input).execute();
            } else {
                break;
            }
        }
    }

    private static Map<String, MenuOption> getMenuOptions() {
        Map<String, MenuOption> options = new HashMap<>();
        options.put("a", MenuOption.PlayHumanVersusHuman());
        options.put("b", MenuOption.PlayHumanVersusSimpleAI());
        options.put("c", MenuOption.PlayHumanVersusImprovedAI());
        return options;
    }
}
