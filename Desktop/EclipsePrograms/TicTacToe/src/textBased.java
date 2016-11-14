import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class textBased implements KeyListener{
	
	static byte currentSpace;
	static char[][] board;
	static boolean turn; //True for x, false for o
	
	public static void main(String[] args) 
	{
		board = new char[3][3];
		currentSpace = 5;
		System.out.println(currentSpace);
	}
	private static void updateBoard(char[][] board)
	{
		System.out.println(currentSpace);
	}
	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			currentSpace -= 3;
			updateBoard(board);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			currentSpace += 3;
			updateBoard(board);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			currentSpace -= 1;
			updateBoard(board);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			currentSpace += 1;
			updateBoard(board);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) 
	{
		
	}
	private static void Sleep(int milli)
    {
        try {
            Thread.sleep(milli);
        }
        catch(InterruptedException ex)
        {

        }
    }
}