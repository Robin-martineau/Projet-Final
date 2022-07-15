
public class Main 
{
    public static void main(String[] args) 
    {
    	Display display = new Display();
    	
        Celsius p1 = new Celsius(10, "Paris");
        
        Button b1 = new Button(display);
        b1.attach(p1);
        
    	CelsiusThermometre tc1 = new CelsiusThermometre(display);
    	FahrenheitThermometre tf1 = new FahrenheitThermometre(display);
        p1.attach(tc1);
        p1.attach(tf1);
        
        
        Celsius p2 = new Celsius(10, "Lille");
        
        Button b2 = new Button(display);
        b2.attach(p2);
        
    	CelsiusThermometre tc2 = new CelsiusThermometre(display);
    	FahrenheitThermometre tf2 = new FahrenheitThermometre(display);                
        p2.attach(tc2);
        p2.attach(tf2);
        
        
        p1.setTemp(10);
        p2.setTemp(15);
    }
}