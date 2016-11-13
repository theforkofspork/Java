import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HoldMouseDown implements KeyListener{
	static boolean Started = false;
	static boolean Stopped = false;
	public static void main(String[] args) throws Exception{
		Robot bot = new Robot();
		while(!Started)
		{
			//While not started
		}
		while(!Stopped){
			System.out.println("Started");
		}
		System.exit(0);

	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			if(!Started){
				Started = true;
			}
			else if(!Stopped){
				Stopped = true;
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
