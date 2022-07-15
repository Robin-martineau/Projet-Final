
public class CelsiusThermometer extends Thermometer {

	public CelsiusThermometer(Celsius tempSource, Display display) {
		super(tempSource, display);
	}

	public void drawTemperature() {
    	setText("Temperature � "+ getTempSource().getVille() + " :: " + getTempSource().getDegrees() + " C�");
    }
}