import java.util.*;

public class mainSystem {
    public static void main(String[] args) {
        int guess, random, lower = 0, upper = 10;
        boolean isCorrect = false;
        Scanner scan = new Scanner(System.in);
        random = randomNumGen.numberGen(upper, lower);   
        
        while(isCorrect == false){
            System.out.println("Enter Your Guess : ");
            guess = scan.nextInt();
            
            if(guess == random){
                System.out.println("You guessed correctly!");
                System.out.println("Congradulations!");
                isCorrect = true;
            }
            else if(guess < random){
                System.out.println("Guess Higher!");
                System.out.println("Try again!");
                isCorrect = false;
            }
            else{
                System.out.println("Guess Lower!");
                System.out.println("Try again!");
                isCorrect = false;
            }
        }
    }
    
}
