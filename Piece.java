import javax.swing.*;
import java.awt.*;


public class Piece
{
    ImageIcon icon;
    boolean isW;
    public Piece()
    {


    }
    void draw(Graphics g, int x, int y)
    {
        g.drawImage(icon.getImage(),x*50,y*50,null);
    }

}
