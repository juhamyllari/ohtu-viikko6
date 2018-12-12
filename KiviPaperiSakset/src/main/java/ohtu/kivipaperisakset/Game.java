package ohtu.kivipaperisakset;

public interface Game {

    void play();

    public static Game humanVsHuman() {
        return new HumanVsHuman();
    }

    public static Game humanVsSimpleAI() {
        return new HumanVsSimpleAI();
    }

    public static Game humanVsImprovedAI(int memorySize) {
        return new HumanVsImprovedAI();
    }

}
