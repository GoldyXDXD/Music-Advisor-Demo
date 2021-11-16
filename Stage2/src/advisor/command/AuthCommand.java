package advisor.Command;

public class AuthCommand extends Decorator {
    private final String id = "24c4d662a07944c8b59949afd35d4b80";
    private final String idMessage = "https://accounts.spotify.com/authorize?client_id=" + id + "&redirect_uri=http://localhost:8080&response_type=code";
    private Command command;

    public AuthCommand(Command command) {
        this.command = command;
        isAuthorized = true;
    }

    public String getMessage() {
        return idMessage + "\n---SUCCESS---";
    }

}
