import javax.swing.*;

public class Bishop extends Piece
{
    int sX,sY,eX,eY;
    public Bishop(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wbisop.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("bbishop.gif");
        }
    }
    public boolean canMove()
    {
        if (Math.abs(sX-eX)<=1&& Math.abs(sY-eY)<=1)
        {
            return true;
        }
        return false;
    }

}
