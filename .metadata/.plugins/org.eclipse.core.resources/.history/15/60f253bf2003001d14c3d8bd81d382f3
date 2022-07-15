import java.util.ArrayList;
import java.util.List;
 
public class Celsius implements SubjectThermo, ObserverBtn {
	private int temp;
	private String ville;
	
	public Celsius(int temp, String ville) {
		this.temp = temp;
		this.ville = ville;
	}
     
    public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifyUpdate(this);
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	private List<ObserverThermo> observers = new ArrayList<>();
 
    @Override
    public void attach(ObserverThermo o) {
        observers.add(o);
    }
 
    @Override
    public void detach(ObserverThermo o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Celsius m) {
        for(ObserverThermo o: observers) {
            o.update(m);
        }
    }
    
    public void update(Button m){
    	this.setTemp(this.getTemp() + 1);
    }
}