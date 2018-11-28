import java.util.*;
public class Main {
    public static void main(String[] args) {
        String welcome = "Welcome to the dating game";
        System.out.println(welcome);

        System.out.println("You sit in your boring 1-room apartment and swipe for girls on tinder, suddently u get a message \"It's a match, you and Andrea liked each other\" she looks so pretty and look a bit like ur mom :D");

        String start = "What do you text her?";

        System.out.println(start);

        dialogOption(new String[]{
                "Hey bby, wanna hang?",
                "Wanna catch a movie?"
        }, "She said yes\nShe wants to see you.",
                "She unmatched u, u pathetic loser",
                "Wanna fuck?");


        System.out.println("What do u propose her to do?");

        dialogOption(new String[]{
                "Go catch a movie",
                "Go to a strip club"},
                "She said yes\nShe wants to meet u",
                "She unmatched u, u pathetic loser",
                "Some casual netflix and chill");

        System.out.println("She comes over to ur lousy apartment\nWhat movie do you pick?");

        dialogOption(new String[]{
                "Shrek the third",
                "Black balls",
                "Where the hell is Herning?"},
                "She likes the idea, she's a woman of culture aswell",
                "She does NOT like the idea, what were u actually thinking dumbass?",
                "Der Untergang");

        System.out.println("When Hitler enters the room and yells at his friends, she starts touching ur thigh\nWhat do you do?");

        dialogOption(new String[]{
                "Moves her hand to ur family jewels"},
                "She kiss ur chin, good job buddy",
                "Wow, don't u have any respect for women?",
                "Removes her hand, u respect Jesus Christ and the good Lord");
    }

    private static void dialogOption (String[] failureOptions, String successMessage, String failureMessage, String successOption) {
        ArrayList<String> options = new ArrayList<>(Arrays.asList(failureOptions));
        options.add(successOption);

        Collections.shuffle(options);

        for (int i=0 ; i<options.size(); i++){
            System.out.println("\t - " + (i+1) + ": " + options.get(i));
        }
        Scanner input = new Scanner(System.in);

        int answerIndex = input.nextInt() - 1;
        String answer = options.get(answerIndex);
        if (answer.equals(successOption)){
            System.out.println("You chose: " + answer);
            System.out.println(successMessage);
        }
        else {
            System.out.println(failureMessage);
            System.exit(0);
        }
    }
}
