
public class FahrenheitThermometre extends Thermometre{
    
	FahrenheitThermometre(Display display) {
		super(display);
		display.addToFrame(this);
	}
    
	public void update(Celsius m) {
    	setText("Temperature à "+ m.getVille() +" :: " + (int)(1.8*m.getTemp()+32) + " F");
    }
}
