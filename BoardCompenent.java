import javax.swing.*;
import java.awt.*;


public class BoardCompenent extends JComponent {

    public static int panel1;
    public void paintComponent(Graphics g)
    {
        Color c1;
        c1=new Color(233,174,95);
        g.setColor(c1);

        Color c2;
        c2=new Color(177,113,24);
        g.setColor(c2);


        g.fillRect(0,0,50,50);
        g.fillRect(0,0,50,50);


        //for every 8 rectangles, a dark rectangle is drawn
        for (int i=0;i<8; i=i+1)
        {
            if (i%2 == 0)
            {
                g.setColor(c2);
            }

            //for another 8 rectangles, it is a light rectangle
            for(int j=0;j<8; j=j+1)
            {

                if (j%2==i%2)
                {
                    g.setColor(c1);
                }
                else
                {
                    g.setColor(c2);
                }
                g.fillRect(i*50,j*50,50,50);
            }
        }

        for (int x=0;x<8;x=x+1)
        {
            for (int y=0;y<8;y=y+1)
            {
                if(Chess.position[x][y]!=null)
                {
                    Chess.position[x][y].draw(g, x, y);
                }
            }
        }


        ImageIcon image;

        image=new ImageIcon("wknight.gif");

        g.drawImage(image.getImage(),0*44,7*44,null);

    }




}
