package blablacar.utils;

import java.util.Calendar;
import java.util.Date;

//Ajoute la precision à la minute pour une date donnée:
/**
 * @param datePrecision
 * @Param hours
 * @Param minutes
 * @return date precise
 *
 */
public class DateUtils {
	public static Date convert(Date datePrecision, short hours, short minutes) {		
		 if (hours > 23){
	         hours =23;
	     }else if (hours<0) {
	           hours = 0;}
	       
	     if (minutes > 59) {
	        minutes = 59;
	     } else if (minutes<0) {
	           minutes =0;}
	       
		Calendar cal = Calendar.getInstance();
		if (datePrecision == null)
			cal.setTime(new Date());
		else
			cal.setTime(datePrecision);		
			cal.set(Calendar.HOUR, hours);
			cal.set(Calendar.MINUTE, minutes);
			
		return cal.getTime();
	}
}
