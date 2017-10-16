package Clock;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {

		long currTime = System.currentTimeMillis() / 1000;
		long midnight = 1508104500L;
		currTime -= midnight;
		currTime %= 9000;
		long hour = currTime / 375;
		currTime %= 375;
		Double currMin =  currTime / 6.25;
		currTime %= 6.25;
		long minute = currMin.intValue();
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
