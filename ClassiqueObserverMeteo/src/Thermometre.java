import java.awt.Color;
import java.awt.Label;

public class Thermometre extends Label implements ObserverThermo {
	
    Thermometre(Display display) {
        display.addToFrame(this);
    }
	
    @Override
    public void update(Celsius m) {
    }
}