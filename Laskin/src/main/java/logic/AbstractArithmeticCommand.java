package logic;

import laskin.Sovelluslogiikka;

public abstract class AbstractArithmeticCommand implements Command {

    Sovelluslogiikka sovellus;
    int argument;

    public AbstractArithmeticCommand(Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
    }
    
    public void execute(int arg) {
        this.argument = arg;
    }
}
