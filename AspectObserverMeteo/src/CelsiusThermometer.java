
public class CelsiusThermometer extends Thermometer {

	public CelsiusThermometer(Celsius tempSource, Display display) {
		super(tempSource, display);
	}

	public void drawTemperature() {
    	setText("Temperature à "+ getTempSource().getVille() + " :: " + getTempSource().getDegrees() + " C°");
    }
}