//Harsh Patil SN-3108491
package griffith;

public class Conversion {
	
		//Stub method to convert celcius To Fahrenheit 
	public static double celciusToFahrenheit(double celcius) {
		//here it returns the temperature in Fahrenheit
			return (celcius*9/5) + 32;
	}
	
	//Stub method to convert fahrenheit To Celcius
	public static double fahrenheitToCelcius(double fahrenheit) {
		//here it returns the temperature in Celcius
			return (fahrenheit - 32)* 5/9;
	}
	
	//Stub method to convert miles To Kilometer
	public static double milesToKilometer(double miles) {
		//here it returns the distance in kilometer
		return miles*1.60934;
	}
	
	//Stub method to convert kilometer To Miles
	public static double kilometerToMiles(double kilometer) {
		//here it returns the distance in miles
		return kilometer/1.60934;
	}
	
	//Stub method to convert upperCase To LowerCase
	public static  String uppercaseToLowercase(String uppercase) {
		//here it returns the string in lowerCase
		return uppercase.toLowerCase();
	}
	
	//Stub method to convert lowerCase To UpperCase
	public static String lowercaseToUppercase(String lowercase) {	
		//here it returns the string in upperCase
		return lowercase.toUpperCase();
	}
}



