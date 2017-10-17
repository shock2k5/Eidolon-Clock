package Clock;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
	    
		TimeZone myZone = TimeZone.getTimeZone("UTC");
		TimeZone.setDefault(myZone);
		
		System.out.println(myZone.toString());
		long currTime = System.currentTimeMillis();
		int midnight = 1508076700;
		System.out.println("Midnight: " + midnight); System.out.println(myZone.getOffset(currTime));
				currTime = (currTime + myZone.getOffset(currTime)) / 1000;
				System.out.println("Current Time: " + currTime);

		currTime -= midnight;
		currTime %= 9000;
		long hour = currTime / 375;
		currTime %= 375;
		Double currMin =  currTime / 6.25;
		currTime %= 6.25;
		int minute = currMin.intValue();
		String zero = (currMin < 10.0) ? "0" : "";
		String ampm = "";
		if (hour % 12 == 0){
			ampm = "";
		} else if(hour > 12){
			ampm = "pm";
			hour -= 12;
		} else {
			ampm = "am";
		}
		System.out.format(hour + ":" + zero + "%.0f%n" + " " + ampm, currMin);
		JOptionPane.showMessageDialog(null, hour + ":" + zero + minute + " " + ampm);	
	}

}
