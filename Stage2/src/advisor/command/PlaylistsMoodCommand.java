package advisor.Command;

public class PlaylistsMoodCommand extends Decorator {

    private Command command;

    public PlaylistsMoodCommand(Command command) {
        this.command = command;
        this.isAuthorized = command.isAuthorized;
    }

    public String getMessage() {
        if (command.isAuthorized) {
            return "---MOOD PLAYLISTS---\n" +
                    "Walk Like A Badass  \n" +
                    "Rage Beats  \n" +
                    "Arab Mood Booster  \n" +
                    "Sunday Stroll";
        } else {
            return "Please, provide access for application.";
        }
    }
}
