import java.util.*;
public class Main {
    public static void main(String[] args) {
        String welcome = "Welcome to the dating game";
        System.out.println(welcome);

        System.out.println("You sit in your boring 1-room apartment and swipe for girls on tinder, suddently u get a message \"It's a match, you and Andrea liked each other\" she looks so pretty and look a bit like ur mom :D");

        String start = "What do you text her?";

        System.out.println(start);

        dialogOption(new String[]{
                "Wanna fuck?",
                "Hey bby, wanna hang?",
                "Wanna catch a movie?"
        }, "She said yes\nShe wants to see you.");


        System.out.println("What do u propose her to do?");

        dialogOption(new String[]{
                "Some casual netflix and chill",
                "Go catch a movie",
                "Go to a strip club"
        }, "She said yes\nShe wants to meet u");
    }

    private static void dialogOption (String[] options, String successMessage) {
        for (int i=0 ; i<options.length; i++){
            System.out.println("\t - " + (i+1)+": " + options[i]);
        }
        Scanner input = new Scanner(System.in);

        int answer = input.nextInt() - 1;

        if (answer == 0){
            System.out.println(successMessage);
        }
        else {
            System.out.println("She unmatched u, u pathetic loser");
            System.exit(0);
        }
    }
}
