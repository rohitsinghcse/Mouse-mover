import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoPressKey {

	public static void main(String[] args) throws AWTException {
		
		while(true) { //Infinite loop
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_F13);
			for(int j = 1; j<15;j++) {
				r.delay(60000); // time in milliseconds ,60000 ms = 1min
			}
		}
	}
}
