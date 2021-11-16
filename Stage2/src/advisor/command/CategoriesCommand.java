package advisor.Command;

public class CategoriesCommand extends Decorator {
    private Command command;

    public CategoriesCommand(Command command) {
        this.command = command;
        this.isAuthorized = command.isAuthorized;
    }

    public String getMessage() {
        if (command.isAuthorized) {
           return "---CATEGORIES---\n" +
                   "Top Lists\n" +
                   "Pop\n" +
                   "Mood\n" +
                   "Latin";
        } else {
            return "Please, provide access for application.";
        }
    }
}
