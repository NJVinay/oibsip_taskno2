import java.util.Random;
import java.util.Scanner;

public class numberguessinggame 
{
    public static void main (String args[]) 
    {   
        int rand, guessed_num, score=0;
        System.out.println("Let's try out a simple number guessing game...");
        System.out.println("\nGuess the number i've guessed now and let's try if it matches");
        
        int min_number = 1;
        final int max_number = 100;

        Scanner num_obj = new Scanner(System.in);
        Random random = new Random();
        rand = random.nextInt(max_number)+1;
        
        for (int i=0;i<5;i++)
        {
            System.out.println("\nTry guessing a number between " + min_number + " and " + max_number);
            System.out.println("\nEnter the number you have guessed : ");
            guessed_num = num_obj.nextInt();
            if (rand==guessed_num) 
            {
                System.out.println("\nYay...! You have a strong predictable sense ;D");
                System.out.println("You have guessed the correct number in " + (i+1) + " trails" );
                score = (5-i)*10;
                break;            
            }
            else if (rand>guessed_num) 
            {
                System.out.println("\nI've guessed a bigger number this time (Thoda sa bada number yaar...!)" + rand);
                           
            }
            else 
            {
                System.out.println("\nI've guessed a smaller number this time (Thoda sa chota number yaar...!)" + rand);
                           
            }        
        }        
        if (score==0) 
        {
            System.out.println("Sorry, you are out of attempts.");
            System.out.println("The correct guess is " + rand);
            System.out.println(" Please try again.");        
        }
        else 
        {
            System.out.println("Your score is " + score);        
        }    
    }    
}