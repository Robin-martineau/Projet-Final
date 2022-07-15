import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Display extends Panel {

    protected Frame frame = new Frame("Subject/Observer Demo");

    Display() {
        frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {System.exit(0);}
            });

        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    void addToFrame(Component c) {
        add(c);
        frame.pack();
    }
}