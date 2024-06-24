import javax.swing.*;

public class Knight extends Piece
{
    int sX,sY,eX,eY;
    public Knight(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wknight.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("bknight.gif");
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
