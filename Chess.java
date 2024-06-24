import javax.swing.*;

public class Chess
{
    static BoardCompenent boardCompenent;

    //the array for all the pieces and their positions
    public static Piece[][] position=new Piece[8][8];

    public static void main(String[] args)
    {
        position[0][3]= new King(false);

        position[7][3]= new King(true);

        position[0][6]= new Queen(false);
        position[4][5]= new Queen(true);

        position[3][5]= new Knight(false);

        position[2][0]=new Knight(true);
        position[6][2]= new Knight(true);

        position[6][4]= new Bishop(false);
        position[7][7]= new Bishop(true);

        //location of the computer player rook's
        position[0][0]= new Rook(false);
        position[7][0]= new Rook(false);

        //location of player rook's
        position[0][7]= new Rook(true);
        position[7][7]= new Rook(true);

        position[6][5]=new Pawn(false);
        position[2][2]=new Pawn(true);


        //makes the game window
        JFrame myWindow;
        myWindow=new

                JFrame("Chess");

        myWindow.setSize(500,500);



        //handles the drawing
        boardCompenent= new BoardCompenent();
        myWindow.add(boardCompenent);

        boardCompenent.addMouseListener(new BoardMouseListener());

        //make the window visable to the player
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }
}
