import java.awt.HeadlessException;
import java.awt.Label;

public class Thermometer extends Label{
	private Celsius tempSource;
	
	public Thermometer(Celsius tempSource, Display display) {
		display.addToFrame(this);
		this.tempSource = tempSource;
	}

	public void setTempSource(Celsius atempSource){
	tempSource = atempSource;;
	}
	
	public Celsius getTempSource(){
	return tempSource;
	}
	
	public void drawTemperature(){}
}