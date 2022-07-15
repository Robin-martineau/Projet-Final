public class Main 
{
    public static void main(String[] args) 
    {
        Celsius t = new Celsius(0);
        
        FahrenheitThermometer tf = new FahrenheitThermometer();
        CelsiusThermometer tc = new CelsiusThermometer();
        tf.setTempSource(t);
        tc.setTempSource(t);
        t.add(tc);
        t.add(tf);
        
        t.setDegrees(15);
        t.setDegrees(20);
        t.setDegrees(25);
        
        
    }
}