import java.sql.Timestamp;
import java.util.Date;
import java.awt.AWTException;
import java.awt.Robot;
import java.lang.*;

public class Mouse {

	public static void main(String[] args) {
		 //Date object
		 Date date= new Date();
	         //getTime() returns current time in milliseconds
		 long time = date.getTime();
	         //Passed the milliseconds to constructor of Timestamp class 
		 Timestamp ts = new Timestamp(time);
		 System.out.println("start Time Stamp: "+ts);
		try {
			
			for (int i = 0; i < 60000; i++) {
				Robot r = new Robot();
				r.mouseMove(223, 221);
				r.delay(60000);
				r.mouseMove(403, 500);
				r.delay(60000);
				System.out.println(i+" End");
					}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Current Time Stamp: "+ts);
	}

}
