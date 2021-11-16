package advisor.Command;

public class NewCommand extends Decorator {

    private Command command;

    public NewCommand(Command command) {
        this.command = command;
        this.isAuthorized = command.isAuthorized;
    }

    public String getMessage() {
        if (command.isAuthorized) {
            return "---NEW RELEASES---\n" +
                    "Mountains [Sia, Diplo, Labrinth]\n" +
                    "Runaway [Lil Peep]\n" +
                    "The Greatest Show [Panic! At The Disco]\n" +
                    "All Out Life [Slipknot]";
        } else {
            return "Please, provide access for application.";
        }
    }
}
