
public class Main {
	
    public static void main(String[] args) {
        Celsius p1 = new Celsius(10);
 
    	CelsiusThermometre tc1 = new CelsiusThermometre();
    	FahrenheitThermometre tf1 = new FahrenheitThermometre();
        p1.attach(tc1);
        p1.attach(tf1);

        p1.setTemp(15);
        p1.setTemp(25);
    }
}