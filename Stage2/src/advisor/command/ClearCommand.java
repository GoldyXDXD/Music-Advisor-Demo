package advisor.Command;

public class ClearCommand extends Command {

    public ClearCommand() {
        message = "Please, provide access for application.";
        isAuthorized = false;
    }

    public String getMessage() {
        return "Please, provide access for application.";
    }
}
