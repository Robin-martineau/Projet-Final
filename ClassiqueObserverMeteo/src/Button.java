import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


class Button extends java.awt.Button implements SubjectBtn {

    static final Color  defaultBackgroundColor = Color.gray;
    static final Color  defaultForegroundColor = Color.black;
    static final String DefaultTexte = "+";

    Button(Display display) {
        super();
        setLabel(DefaultTexte);
        setBackground(defaultBackgroundColor);
        setForeground(defaultForegroundColor);
        addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Button.this.click();
                }
            });
        display.addToFrame(this);
    }
    
	private List<ObserverBtn> observers = new ArrayList<>();
	 
    @Override
    public void attach(ObserverBtn o) {
        observers.add(o);
    }
 
    @Override
    public void detach(ObserverBtn o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Button m) {
        for(ObserverBtn o: observers) {
            o.update(m);
        }
    }

	public void click() {notifyUpdate(this);}
}
