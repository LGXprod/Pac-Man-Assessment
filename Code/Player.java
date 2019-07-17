import java.lang.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int collectedDots;
    private boolean alive;

    /**
     * Constructor for objects of class Player
     */
    public Player(int a, int b)
    {
        x = a;
        y = b;
        collectedDots = 0;
        alive = true;
    }
    
    public void move(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void collect(Dot adot){
        if (adot.getExists() == true && x == adot.getX() && y == adot.getY()){
            ++collectedDots;
            adot.disappear();
        }
    }
    
    public void exiting(Exit exit){
        if (collectedDots == 3 && x == exit.getX() && y == exit.getY()){
            exit.open();
        }
    }
    
    public void dies(Enemy theEnemy){
        if (theEnemy.getX() == x && theEnemy.getY() == y && 
        theEnemy.getEnemyGone() == true){
            alive = false;
        }
        
        if (Math.abs(theEnemy.getX()-x) == 1 && y == 0){
            alive = false;
        }
        
    }
    
    
    public boolean getAlive(){
        return this.alive;
    }
    
    public String toString(){
       String dotsS = "";
       for (int i=1; i<=collectedDots; ++i){
           dotsS = dotsS + "*";
       }
       return "Player[" + dotsS + "]" + Util.objectStr(x, y, alive); 
    }

}
