
public class FahrenheitThermometer extends Thermometer{
	public FahrenheitThermometer(Celsius tempSource, Display display) {
		super(tempSource, display);
	}

	public void drawTemperature() {
    	setText("Temperature � "+ getTempSource().getVille() + " :: " + (int)(getTempSource().getDegrees()*1.8+32) + " F");
    }
}