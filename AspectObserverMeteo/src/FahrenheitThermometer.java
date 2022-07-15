
public class FahrenheitThermometer extends Thermometer{
	public FahrenheitThermometer(Celsius tempSource, Display display) {
		super(tempSource, display);
	}

	public void drawTemperature() {
    	setText("Temperature à "+ getTempSource().getVille() + " :: " + (int)(getTempSource().getDegrees()*1.8+32) + " F");
    }
}