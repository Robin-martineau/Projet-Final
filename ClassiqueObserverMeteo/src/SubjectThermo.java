public interface SubjectThermo 
{
    public void attach(ObserverThermo o);
    public void detach(ObserverThermo o);
    public void notifyUpdate(Celsius m);
}