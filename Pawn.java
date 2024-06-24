import javax.swing.*;

public class Pawn extends Piece
{
    int sX,sY,eX,eY;
    public Pawn(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wpawn.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("bpawn.gif");
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
