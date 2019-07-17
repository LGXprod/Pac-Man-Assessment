
/**
 * Write a description of class Dot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dot
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private boolean exists;

    /**
     * Constructor for objects of class Dot
     */
    public Dot(int a, int b)
    {
        x = a;
        y = b;
        exists = true;
    }
    
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
    
    public boolean getExists(){
        return this.exists;
    }

    public void disappear(){
        exists = false;
    }
    
    public String toString(){
        return "Dot" + Util.objectStr(x, y, exists);
    }

}
