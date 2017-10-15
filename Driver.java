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
		String zero = (currMin < 10) ? "0" : "";
		System.out.format(hour + ":" + zero + "%.0f%n", currMin);
		JOptionPane.showMessageDialog(null, hour + ":" + minute);	
	}

}
