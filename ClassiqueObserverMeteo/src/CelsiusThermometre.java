
public class CelsiusThermometre extends Thermometre {
	
    CelsiusThermometre(Display display) {
		super(display);
		display.addToFrame(this);
	}

	public void update(Celsius m) {
    	setText("Temperature à "+ m.getVille() +" :: " + m.getTemp() + " C°");
    }
}
