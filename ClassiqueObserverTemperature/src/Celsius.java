import java.util.ArrayList;
import java.util.List;
 
public class Celsius implements Subject {
	private int temp;
	
	public Celsius(int temp) {
		this.temp = temp;
	}
     
    public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifyUpdate(this);
	}

	private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Celsius m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}