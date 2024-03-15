package command.smartHomeCommand;

public class Main {
    public static void main(String[] args) {
        
        Light light = new Light();
    
        SimpleRemoteControl uwu = new SimpleRemoteControl();
        uwu.setCommand( new LightOnCommand(light));
        uwu.buttonWasPressed();
    }
}
