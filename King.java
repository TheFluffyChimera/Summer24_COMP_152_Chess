import javax.swing.*;

public class King extends Piece
{

    int sX,sY,eX,eY;
    public King(boolean w)
    {
        if (w==true)
        {
            isW=true;
            icon= new ImageIcon("wking.gif");
        }
        else
        {
            isW=false;
            icon=new ImageIcon("bking.gif");
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
