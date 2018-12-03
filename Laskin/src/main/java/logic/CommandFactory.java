package logic;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.Button;
import laskin.Sovelluslogiikka;

public class CommandFactory {

    private Map<Button, Command> commands;
    
    public CommandFactory(Sovelluslogiikka sovellus, Button add, Button subtract, Button zero) {
        this.commands = new HashMap<>();
        this.commands.put(add, new Add(sovellus));
        this.commands.put(subtract, new Subtract(sovellus));
        this.commands.put(zero, new Zero(sovellus));
    }
    
    public Command get(Button command) {
        return commands.get(command);
    }
    
    
}
