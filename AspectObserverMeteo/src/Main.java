public class Main 
{
    public static void main(String[] args) 
    {
    	Display display = new Display();

        Button btn1 = new Button(display);
        Celsius t1 = new Celsius(15, "Paris");
        btn1.add(t1);
        FahrenheitThermometer tf1 = new FahrenheitThermometer(t1, display);
        CelsiusThermometer tc1 = new CelsiusThermometer(t1, display);
        t1.add(tc1);
        t1.add(tf1);
        t1.setDegrees(15);
        
        Button btn2 = new Button(display);
        Celsius t2 = new Celsius(12, "Lille");
        
        btn2.add(t2);
        FahrenheitThermometer tf2 = new FahrenheitThermometer(t2, display);
        CelsiusThermometer tc2 = new CelsiusThermometer(t2, display);
        t2.add(tc2);
        t2.add(tf2);
        t2.setDegrees(12);
    }
}