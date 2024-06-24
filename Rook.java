import javax.swing.*;

public class Rook extends Piece
{
    int sX,sY,eX,eY;
    public Rook(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wrook.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("brook.gif");
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
