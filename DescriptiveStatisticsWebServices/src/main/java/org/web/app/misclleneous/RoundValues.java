package org.web.app.misclleneous;

import java.text.DecimalFormat;

public class RoundValues {

	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    DecimalFormat df = new DecimalFormat("#.00");
	    return (double) Double.parseDouble(df.format(tmp / factor));
	}	
}
