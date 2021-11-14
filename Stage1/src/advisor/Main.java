/*
When developing your web applications, it can be useful to implement the ability to register users using third-party services (such as Twitter, Facebook, Google, etc.), as well as the ability to interact with these services (for example, use Twitter to publish a post, or getting a list of friends on Facebook). To implement this functionality, you need to learn how to work with the service's API. Most services use REST (Representational State Transfer) to provide the ability to interact with the service. To learn how to work with it from Java, we will develop a simple application that will offer us music using Spotify.

First, in this stage, you have to implement simple functionality to read user input and provide information at the user's request.

featured — a list of Spotify-featured playlists with their links fetched from API;
new — a list of new albums with artists and links on Spotify;
categories — a list of all available categories on Spotify (just their names);
playlists C_NAME, where C_NAME is the name of category. The list contains playlists of this category and their links on Spotify;
exit shuts down the application.

Notice that here, you don’t need to implement interaction with the API (you will do that later), just replace the API responses with simple strings.
*/

package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            String userMessage = scanner.nextLine();
            switch (userMessage) {
                case "new":
                    System.out.println("---NEW RELEASES---\n" +
                            "Mountains [Sia, Diplo, Labrinth]\n" +
                            "Runaway [Lil Peep]\n" +
                            "The Greatest Show [Panic! At The Disco]\n" +
                            "All Out Life [Slipknot]");
                    break;
                case "featured":
                    System.out.println("---FEATURED---\n" +
                            "Mellow Morning\n" +
                            "Wake Up and Smell the Coffee\n" +
                            "Monday Motivation\n" +
                            "Songs to Sing in the Shower");
                    break;
                case "categories":
                    System.out.println("---CATEGORIES---\n" +
                            "Top Lists\n" +
                            "Pop\n" +
                            "Mood\n" +
                            "Latin");
                    break;
                case "playlists Mood":
                    System.out.println("---MOOD PLAYLISTS---\n" +
                            "Walk Like A Badass  \n" +
                            "Rage Beats  \n" +
                            "Arab Mood Booster  \n" +
                            "Sunday Stroll");
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    System.exit(0);
            }
        }
    }
}
