import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    //private Game aGame;

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        System.out.print("Initial x: ");
        Scanner sc = new Scanner(System.in);
        int initialX = sc.nextInt(); sc.nextLine();
        int tries = 1;
        
        while (initialX < 0 && tries < 3){
            System.out.println("Must not be negative.");
            System.out.print("Initial x: ");
            initialX = sc.nextInt(); sc.nextLine();
            ++tries;
        }
        
        if (initialX < 0 && tries == 3){
            System.out.println("Must not be negative.");
            System.out.println("Too many errors. Exiting.");
        } else{
            System.out.print("Initial y: ");
            int initialY = sc.nextInt(); sc.nextLine();
            tries = 1;
            
            while (initialY < 0 && tries < 3){
                System.out.println("Must not be negative.");
                System.out.print("Initial y: ");
                initialY = sc.nextInt(); sc.nextLine();
                ++tries;
            }
            
            if (initialY < 0 && tries == 3){
                System.out.println("Must not be negative.");
                System.out.println("Too many errors. Exiting.");
            } else{
                Game aGame = new Game(initialX, initialY);
                aGame.start();
            }
        }
        
    }

}
