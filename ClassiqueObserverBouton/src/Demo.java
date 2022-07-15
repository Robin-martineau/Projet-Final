public class Demo {
    public static void main(String[] args) {

        Display display = new Display();
        Button b1 = new Button(display);
        Button b2 = new Button(display);
        ColorLabel c1 = new ColorLabel(display);
        ColorLabel c2 = new ColorLabel(display);
        ColorLabel c3 = new ColorLabel(display);

        b1.attach(c1);
        b1.attach(c2);
        b2.attach(c3);
    }
}
