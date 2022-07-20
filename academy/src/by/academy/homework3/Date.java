package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	
	  public boolean test(String testString){  // dd/MM/yyyy
	        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/(19|20\\d\\d)");	        					 
	        Matcher matcher = pattern.matcher(testString);
	        return matcher.matches();
	      }
	  
	  public boolean test1(String testString){  
	        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\-(0[1-9]|1[0-2])\\-(19|20\\d\\d)");	        					 
	        Matcher matcher = pattern.matcher(testString);
	        return matcher.matches();
	      } 
}
