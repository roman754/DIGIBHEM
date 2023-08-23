// creating a Guess game using java
import java.util.Scanner;
public class Game {
    public static void
    GuessNumberGame()
    {
            try (Scanner sc = new Scanner(System.in)) {
                int a = 1 + (int)(100 * Math.random());
                int b = 10;
                int i, guess;
                System.out.println("A number is chosen between 1 to 100. Guess the number within 10 trials");
                for (i=0;i<b;i++) {
                    System.out.println("Guess the no. :");
                    guess=sc.nextInt();
                    if (a == guess) {
                        System.out.println("Excellent you guessed the correct no.");
                        break;
                    }
                    else if (a < guess & 1 != b-1) {
                        System.out.println("The no. is less than" + guess);
                    }
                    else if (a > guess & 1 != b-1) { 
                        System.out.println("The no. is greater than" + guess);
                    }            
                }
                if (i==b) {
                    System.out.println("You have completed 10 trials");
                    System.out.println("The no. is " + a);
                }
            }
        } 
        public static void
            main(String arg[])
        {
            GuessNumberGame();   
        }
    }

