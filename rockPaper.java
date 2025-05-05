
import java.util.Random;
import java.util.Scanner;

public class rockPaper {
    public static void main(String[] args){
        // ROCK PAPER SCISSORS GAME
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();

        // Declare variables
        String[] choices={"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do { 
            // Get choice from user
        System.out.print("Enter your move (Rock, Paper, Scissor): ");
        playerChoice= scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper")&& ! playerChoice.equals("scissors")) {
            System.out.println("Invalid Choice!");
            continue;  
        }

        //Get random choice from computer
        computerChoice= choices[random.nextInt(3)];
        System.out.println("Computer's Choice: "+ computerChoice);

        //Check win conditions

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a Tie !😒");
            
        }
        else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
        (playerChoice.equals("paper") && computerChoice.equals("rock")) || 
        (playerChoice.equals("scissors") && computerChoice.equals("paper")) ){
            System.out.println("You win😊");
        }
        else{
            System.out.println("You lose😓");
        }
        //Ask to play again?
        System.out.print("Play again !(Yes/no)");
        playAgain=scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        
        //Goodbye! 
        System.out.println("Thanks for playing 👍");
        scanner.close();
    }
    
}
