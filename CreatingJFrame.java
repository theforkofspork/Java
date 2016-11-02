import javax.swing.JFrame;
import java.awt.Color;
public class CreatingJFrame{
    public static void main(String[] args){
        //Intitialize variables
        final int JFRAME_SIZE_X = 500;
        final int JFRAME_SIZE_Y = 500;
        final String JFRAME_TITLE = "JFrame";
        final Color JFRAME_BACKGROUND_COLOR = Color.lightGray;
        
        //Initialize JFrame
        JFrame frame = new JFrame(JFRAME_TITLE);
        
        //Set frame attribute
        frame.setSize(JFRAME_SIZE_X,JFRAME_SIZE_Y);
        frame.setBackground(JFRAME_BACKGROUND_COLOR);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Show the frame
        frame.setVisible(true);
    }
}
