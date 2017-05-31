package org.web.app.Utilities;

import java.text.DecimalFormat;

/**
 * This class round off the value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class RoundValues {

	public static double round(double value, int places) {
		DecimalFormat df = new DecimalFormat("#.00");
		return (double) Double.parseDouble(df.format(value));
	}
}
