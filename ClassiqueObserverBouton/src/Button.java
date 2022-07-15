import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

class Button extends java.awt.Button implements Subject {

    static final Color  defaultBackgroundColor = Color.gray;
    static final Color  defaultForegroundColor = Color.black;
    static final String defaultText = "cycle color";

    Button(Display display) {
        super();
        setLabel(defaultText);
        setBackground(defaultBackgroundColor);
        setForeground(defaultForegroundColor);
        addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Button.this.click();
                }
            });
        display.addToFrame(this);
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
    public void notifyUpdate(Button m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }

	public void click() {notifyUpdate(this);}
}
