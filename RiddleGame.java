import java.io.*;
import java.util.*;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> riddles = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        List<String> hints = new ArrayList<>();
        int score = 0;

        // Load data from the file
        try (BufferedReader br = new BufferedReader(new FileReader("riddles.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) { // Ensure this line contains a riddle
                    riddles.add(line.trim());
                    answers.add(br.readLine().trim());
                    hints.add(br.readLine().trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the riddles file: " + e.getMessage());
        }
        

        // Welcome message
        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Rules:\n1.For every correct answer you get 2 points.\n2.Type 'exit' to quit the game. \n3.Type 'skip' to skip the riddle.\n4.Type 'hint' to get a hint.\n5.Correct answer after using hint gets only 1 point.");
        System.out.println("Let's begin!\n");

        Random random = new Random();
        String h="no";
        int randomIndex=0,ts=0;
        String selectedRiddle ="";
        String correctAnswer = "";
        String hint = "";
        // Game loop
        while (true) {
            if(h.equals("no")){
                randomIndex = random.nextInt(riddles.size());
                selectedRiddle = riddles.get(randomIndex);
                correctAnswer = answers.get(randomIndex);
                hint = hints.get(randomIndex);
                System.out.println(selectedRiddle);
                ts+=2;
            }
            // Get user's answer
            System.out.println("Enter your answer: ");
            String userAnswer = scanner.nextLine().trim();

            // Exit the game
            if (userAnswer.trim().equalsIgnoreCase("exit")) {
                break;
            }
            else if (userAnswer.trim().equalsIgnoreCase("skip")) {
                h="no";
                continue;
            }
            else if (userAnswer.trim().equalsIgnoreCase("hint")) {
                h="yes";
                System.out.println(hint);
                continue;
            }

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                if(h.equals("yes")){
                    score+=1;
                }
                else{
                    score+=2;
                }
                h="no";
            } 
            else{
                System.out.println("Wrong one!!! Dont give up, just give an other try");
                h="yn";
                continue;
            }
            System.out.println("Do you want to continue for next riddle:");
            if(!scanner.nextLine().trim().equals("yes")){
                break;
            }
        }
        // Display final score
        System.out.println("Your final score: " + score+"/"+ts);
        System.out.println("Thanks for playing!");
    }
}
