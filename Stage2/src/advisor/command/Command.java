package advisor.Command;

public abstract class Command {

    String message = "Please, provide access for application.";
    boolean isAuthorized = false;

    public String getMessage() {
        return message;
    }
}
