package logic;

public interface Command {
    
    public void execute(int arg);

    public void undo();
    
}
