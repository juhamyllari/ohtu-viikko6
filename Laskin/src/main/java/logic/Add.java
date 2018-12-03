package logic;

import laskin.Sovelluslogiikka;

public class Add extends AbstractArithmeticCommand {

    public Add(Sovelluslogiikka sovellus) {
        super(sovellus);
    }
    
    @Override
    public void execute(int arg) {
        this.argument = arg;
        sovellus.plus(arg);
    }

    @Override
    public void undo() {
        sovellus.miinus(argument);
    }
    
}
