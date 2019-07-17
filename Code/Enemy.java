import java.lang.*;
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private boolean exists;

    /**
     * Constructor for objects of class Enemy
     */
    public Enemy(int a)
    {
        x = 5;
        y = 5;
        exists = true;
    }
    
    public void move(int playerY1, int playerX1, int playerX2, int playerY2){
        int xDist = playerX1 - x;
        int yDist = playerY1 - y;
        //System.out.println(Math.abs(xDist));
        //System.out.println(yDist);
        if (Math.abs(xDist) > Math.abs(yDist)){
            if (xDist < 0){
                --x; //player is above of the enemy
            } else if (Math.abs(xDist) == 1){
                System.out.println("true");
            } else{
                ++x;
            }
        } else if (Math.abs(xDist) < Math.abs(yDist)){
            if (yDist < 0){
                --y; //player is above of the enemy
            } else{
                ++y;
            }
        } else{
            if (xDist < 0){
                --x; //player is above of the enemy
            } else if (Math.abs(xDist) == 1){
                System.out.println("true");
            } else{
                ++x;
            }
        }
        
    }
    
    public void enemyGone(){
        exists = false;
    }
    
    public boolean getEnemyGone(){
        return this.exists;
    }
    
    public int getX(){ 
        return this.x;
    }
    
    public int getY(){ 
        return this.y;
    }
    
    public String toString(){
        return "Enemy" + Util.objectStr(x, y, exists);
    }

}
