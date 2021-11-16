/*
So, in this stage, you must go to the Spotify Web site for developers and create your application.
To create an application, you should select Dashboard tab on the site, log in to Spotify, and click the button Create an App.

Add one more command to your program: an auth command that will print the auth link and allow us to use another command (no real authorization required, just print a workable link and make some Boolean field true). Don't forget to put your client id in this link.

Make commands unavailable if user access for your program is not confirmed (if they did not call the auth command).

Remember that you should add your redirect_uri in the settings of your application.
*/
package advisor;

import advisor.Command.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command command = new ClearCommand();
        String userMessage;
        do {
            userMessage = scanner.nextLine();
            switch (userMessage) {
                case "new":
                    command = new NewCommand(command);
                    System.out.println(command.getMessage());
                    break;
                case "featured":
                    command = new FeaturedCommand(command);
                    System.out.println(command.getMessage());
                    break;
                case "auth":
                    command = new AuthCommand(command);
                    System.out.println(command.getMessage());
                    break;
                case "categories":
                    command = new CategoriesCommand(command);
                    System.out.println(command.getMessage());
                    break;
                case "playlists Mood":
                    command = new PlaylistsMoodCommand(command);
                    System.out.println(command.getMessage());
                    break;
            }
        } while (!userMessage.equals("exit"));
        System.out.println("---GOODBYE!---");
    }
}
