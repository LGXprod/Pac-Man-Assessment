import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private Player player;
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;
    private Exit exit;
    private Enemy enemy;
    
    Game(){
        Scanner sc = new Scanner(System.in);
        player = new Player(sc.nextInt(), sc.nextInt()); // creates a player object
        dot1 = new Dot(sc.nextInt(), sc.nextInt());
        dot2 = new Dot(sc.nextInt(), sc.nextInt());
        dot3 = new Dot(sc.nextInt(), sc.nextInt());
        exit = new Exit(4, 4);
        enemy = new Enemy(5);
    }
    
    Game(int a, int b){
        player = new Player(a, b);
        int i = 1;
        dot1 = new Dot(i, i);
        ++i;
        dot2 = new Dot(i, i);
        ++i;
        dot3 = new Dot(i, i);
        exit = new Exit(4,4);
        enemy = new Enemy(a);
        if (a != 5) enemy.enemyGone();
    }
    
    public void move(int dx, int dy){
        int currentX = player.getX();
        int currentY = player.getY();
        player.move(dx, dy);
        player.collect(dot1);
        player.collect(dot2);
        player.collect(dot3);
        player.exiting(exit);
        enemy.move(currentY, currentX, player.getX(), player.getY());
        player.dies(enemy);
    }
    
    public void input(){
        System.out.print("Move (l/r/u/d): ");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        switch (letter)
        {
            case "l":
                move(-1, 0);
                break;
            case "r":
                move(1, 0);
                break;
            case "u":
                move(0, -1);
                break;
            case "d":
                move(0, 1);
                break;
            default:
                System.out.println("Invalid move");
                break;
        }
    }
    
    public void start(){
        while (exit.getOpenClose() == true && player.getAlive() == true){
            System.out.println(toString());
            input();
        }
        System.out.println(toString());
        if (player.getAlive() == false){
            System.out.println("You lose!");
        } else{
            System.out.println("You win!");
        }
        
    }
    
    public String toString(){
        String s = player + " " + dot1 + " " + dot2 + " " + dot3 + " " + exit;
        if (enemy.getEnemyGone() == true){
            s = s + " " + enemy;
        }
        return s;
        
    }
    
}
