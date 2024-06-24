import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardMouseListener implements MouseListener
{
    int startX;
    int startY;
    int endX;
    int endY;



    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    //clicking the starting location of the piece
    @Override
    public void mousePressed(MouseEvent e)
    {
        startX= e.getX()/50;
        startY=e.getY()/50;
    }

    //places the piece on a new spot after being dragged
    @Override
    public void mouseReleased(MouseEvent e)
    {



        //prevents person from moving a piece to its own square
        if (startX==endX && startY==endY)
        {
            return;
        }

        //checks for a piece in the starting coordinate
        if (Chess.position[startX][startY]==null)
        {
            return;
        }



        endX=e.getX()/50;
        endY=e.getY()/50;
        Chess.position[endX][endY] = Chess.position[startX][startY];
        Chess.position[startX][startX] = null;
        Chess.boardCompenent.repaint();


        while(true)
        {
            Math.random();

            if (Chess.position[startX][startY]==null)
            {
                break;
            }

            if(startX==endX&&startY==endY)
            {
                break;
            }







        }



    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
