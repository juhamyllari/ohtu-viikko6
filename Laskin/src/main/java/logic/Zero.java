package logic;

import laskin.Sovelluslogiikka;

public class Zero extends AbstractArithmeticCommand {

    public Zero(Sovelluslogiikka sovellus) {
        super(sovellus);
    }

    @Override
    public void execute(int arg) {
        this.argument = sovellus.tulos();
        sovellus.nollaa();
    }

    @Override
    public void undo() {
        sovellus.plus(argument);
    }

}
