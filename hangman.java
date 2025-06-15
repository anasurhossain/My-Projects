import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Hangman game implementation in Java.
 * The game reads a list of words from a file and allows the user to guess letters
 * until they either guess the word or run out of attempts.
 */

public class hangman {
    public static void main(String [] args){
        //JAVA GAME
        String filePath = "words.txt"; // Path to the file containing words
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
           
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file ");
        }catch (IOException e) {
            System.out.println("Something went wrong while reading the file: ");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size())); // Randomly select a word from the list
        
 
       
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }
        System.out.println("*************************");
        System.out.println("Welcome to JAVA Hangman!");
        System.out.println("*************************");

        while( wrongGuesses < 6 ){
        System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("word: ");
        for(char c : wordState){
            System.out.print(c + " ");
        }
        System.out.println(" ");
        System.out.print("Guess a letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);
        
        if(word.indexOf(guess) >= 0){
            System.out.println("Correct guess!");
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == guess){
                    wordState.set(i, guess);
                }
            }
            if(!wordState.contains('_')){
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("Congratulations! You guessed the word: " + word.toUpperCase());
                break;
            }
        }else{
            System.out.println("Wrong guess!");
            wrongGuesses++;
            }
        }
        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game Over!");
            System.out.println("The word was: " + word.toUpperCase());
        }

        scanner.close();
       
    }
    static String getHangmanArt (int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    


                      """;
            case 1 -> """
                       0


                      """;
            case 2 -> """
                        0        
                        |

                      """;
            case 3 -> """
                        0        
                       /|

                      """;
            case 4 -> """
                        0        
                       /|\\

                      """;
            case 5 -> """
                        0        
                       /|\\
                       /
                      """;
            case 6 -> """
                        0        
                       /|\\
                       / \\
                      """;
            default ->"";
        };
    }
}
