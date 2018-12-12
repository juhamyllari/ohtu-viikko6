package ohtu.kivipaperisakset;

public class SimpleAI implements Player {

    int siirto;

    public SimpleAI() {
        siirto = 0;
    }

    @Override
    public String move() {
        String move = getMove();
        System.out.println("Tietokone valitsi: " + move);
        return move;
    }

    private String getMove() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    @Override
    public void update(String ekanSiirto) {
    }
}
