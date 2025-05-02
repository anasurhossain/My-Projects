
import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        
        // JAVA QUIZ GAME

        //question array[]

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered as brain?",
                              "What year was Facebook launched?", 
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};
        //option array[]

        String[][] options = {{"1. Storing files", "2.Encrypting data","3.Directing internet traffic", "4. Managing password"},
                            {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                            {"1.2000", "2. 2004", "3. 2006", "4. 2008"},
                            {"1. Steve Jobs", "2. Bill Gates", "3. Elon Mask", "4. Charles Babbage"}, 
                            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};
        // Declare variables
        int[] answers = {3, 1, 2, 4, 3};  
        int score = 0;
        int guess;
        
        Scanner scanner=new Scanner(System.in);
        
        //welcome massage
        System.out.println("******************************");
        System.out.println("Welcome to the JAVA QUIZ game.");
        System.out.println("******************************");
        //question (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);       
            for(String option: options[i]){     //  options
                System.out.println(option);

                //  get guess from user
            }
            System.out.print("Enter your guess: ");
            guess=scanner.nextInt();

            //  check our guess
            if(guess == answers[i]){
                System.out.println("#########");
                System.out.println("CORRECT !");
                System.out.println("#########");
                score++;
            }else{
                System.out.println("#########");
                System.out.println("WRONG !");
                System.out.println("#########");
            }
        }
           //  Display final score

        System.out.println("Your Final score is: " + score +" out of "+ questions.length);
        
        
        
        scanner.close();
    }
    
}
