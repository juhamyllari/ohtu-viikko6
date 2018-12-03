package laskin;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import logic.Command;
import logic.CommandFactory;

public class Tapahtumankuuntelija implements EventHandler {

    private TextField tuloskentta;
    private TextField syotekentta;
    private Button plus;
    private Button miinus;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovellus;
    private CommandFactory commandFactory;
    private Command previous;

    public Tapahtumankuuntelija(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
        this.commandFactory = new CommandFactory(sovellus, plus, miinus, nollaa);
        this.previous = null;
    }

    @Override
    public void handle(Event event) {
        Command command = commandFactory.get((Button) event.getTarget());
        if (event.getTarget() == undo) {
            previous.undo();
            this.undo.setDisable(true);
        } else {
            command.execute(Integer.parseInt(syotekentta.getText()));
            this.previous = command;
            this.undo.setDisable(false);
        }
        this.tuloskentta.setText(String.valueOf(sovellus.tulos()));
        this.nollaa.setDisable(tuloskentta.getText().equals("0"));
    }

}
