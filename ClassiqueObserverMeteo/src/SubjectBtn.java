
public interface SubjectBtn {
    public void attach(ObserverBtn o);
    public void detach(ObserverBtn o);
    public void notifyUpdate(Button m);
}
