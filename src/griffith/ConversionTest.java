//Harsh Patil SN-3108491
package griffith;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions.*;

public class ConversionTest {
	
	//Here creating an instance of the conversion class to use in tests 
	Conversion convert = new Conversion();
	
	//Test Stub method to convert celcius To Fahrenheit   
	@Test
	public void testCelciusToFahrenheit() {
		//here checking the conversion for different temperatures
		assertEquals(32.0,Conversion.celciusToFahrenheit(0),0.001);
		assertEquals(68.0,Conversion.celciusToFahrenheit(20),0.001);
		assertEquals(-22.0,Conversion.celciusToFahrenheit(-30),0.001);
		
		}
	
	//Test method to convert fahrenheit To Celcius
	@Test
	public void testFahrenheitToCelcius() {
		//here checking the conversion for different temperatures
		assertEquals(100,Conversion.fahrenheitToCelcius(212),0.001);
		assertEquals(-40,Conversion.fahrenheitToCelcius(-40),0.001);
		assertEquals(0.0,Conversion.fahrenheitToCelcius(32),0.001);
		}
	
	//Test Stub method to convert miles To Kilometer
	@Test
	public void testMilesToKilometer() {
		//here checking the conversion for different distances
		assertEquals(16.0934,Conversion.milesToKilometer(10),0.001);
		assertEquals(0.321869,Conversion.milesToKilometer(0.2),0.001);
		assertEquals(1.60934,Conversion.milesToKilometer(1),0.001);
		}
	
	//Test Stub method to convert kilometer To Miles
	@Test
	public void testKilometerToMiles(){
		//here checking the conversion for different distances
		assertEquals(0.124274,Conversion.kilometerToMiles(0.2),0.001);
		assertEquals(6.2137,Conversion.kilometerToMiles(10),0.001);
		assertEquals(31.0686,Conversion.kilometerToMiles(50),0.001);
		}
	
	//Test Stub method to convert uppercase To Lowercase
	@Test
	public void testUppercaseToLowercase() {
		//here checking the conversion for different strings
		assertEquals("JAVA",Conversion.uppercaseToLowercase("java"));
		assertEquals("PYTHON",Conversion.uppercaseToLowercase("python"));
		assertEquals("SQL",Conversion.uppercaseToLowercase("sql"));
		}
	
	//Test Stub method to convert lowercase To Uppercase
	@Test
	public void testLowercaseToUppercase() {
		//here checking the conversion for different strings
		assertEquals("hello",Conversion.lowercaseToUppercase("HELLO"));
		assertEquals("world",Conversion.lowercaseToUppercase("WORLD"));
		assertEquals("griffith",Conversion.lowercaseToUppercase("GRIFFITH"));
		
	}
}


