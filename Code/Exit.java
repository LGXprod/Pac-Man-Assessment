
/**
 * Write a description of class Exit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exit
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private boolean openClose;

    public Exit(int a, int b)
    {
        x = a;
        y = b;
        openClose = true;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void open(){
        openClose = false;
    }
    
    public boolean getOpenClose(){
        return this.openClose;
    }
    
    public String toString(){
        return "Exit" + Util.objectStr(x, y, openClose);
    }

}
