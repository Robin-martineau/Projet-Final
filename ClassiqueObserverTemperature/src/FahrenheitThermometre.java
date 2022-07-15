
public class FahrenheitThermometre extends Thermometre{

	public void update(Celsius m) {
    	System.out.println("Temperature in Fahrenheit: " + (int)(1.8*m.getTemp()+32));
    }
}
