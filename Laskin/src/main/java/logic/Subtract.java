package logic;

import laskin.Sovelluslogiikka;

public class Subtract extends AbstractArithmeticCommand {

    public Subtract(Sovelluslogiikka sovellus) {
        super(sovellus);
    }
    
    @Override
    public void execute(int arg) {
        this.argument = arg;
        sovellus.miinus(arg);
    }
    
    @Override
    public void undo() {
        sovellus.plus(argument);
    }
}
