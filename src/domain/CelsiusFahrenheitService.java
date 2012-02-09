package domain;

public class CelsiusFahrenheitService {
	// http://localhost:8080/TemperatureConverterWS/services?CelsiusFahrenheitService
	public CelsiusFahrenheitService() {}

	public String convertCtoF(String degrees_celsius) {
		float operand = Float.valueOf(degrees_celsius.trim()).floatValue();
		float degrees_fahrenheit = (operand / 5 * 9) + 32;
		return Float.toString(degrees_fahrenheit);
	}
	
	public String convertFtoC(String degrees_fahrenheit) {
		float operand = Float.valueOf(degrees_fahrenheit.trim()).floatValue();
		float degrees_celsius = (operand - 32) * 5 / 9;
		return Float.toString(degrees_celsius);
	}
}
