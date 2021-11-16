package advisor.Command;

public class FeaturedCommand extends Decorator {
    private Command command;

    public FeaturedCommand(Command command) {
        this.command = command;
        this.isAuthorized = command.isAuthorized;
    }

    public String getMessage() {
        if (command.isAuthorized) {
            return "---FEATURED---\n" +
                    "Mellow Morning\n" +
                    "Wake Up and Smell the Coffee\n" +
                    "Monday Motivation\n" +
                    "Songs to Sing in the Shower";
        } else {
            return "Please, provide access for application.";
        }
    }
}
