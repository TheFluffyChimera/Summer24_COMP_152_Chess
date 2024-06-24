import javax.swing.*;

public class Queen extends Piece
{
    int sX,sY,eX,eY;
    public Queen(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wqueen.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("bqueen.gif");
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
