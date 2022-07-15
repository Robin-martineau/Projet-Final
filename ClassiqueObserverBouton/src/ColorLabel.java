/*
Copyright (c) Xerox Corporation 1998-2002.  All rights reserved.

Use and copying of this software and preparation of derivative works based
upon this software are permitted.  Any distribution of this software or
derivative works must comply with all applicable United States export control
laws.

This software is made available AS IS, and Xerox Corporation makes no warranty
about the software, its performance or its conformity to any specification.
*/


import java.awt.Color;
import java.awt.Label;

class ColorLabel extends Label implements Observer {

    ColorLabel(Display display) {
        super();
        display.addToFrame(this);
    }

    final static Color[] colors = {Color.red, Color.blue,
                                   Color.green, Color.magenta};
    private int colorIndex = 0;
    private int cycleCount = 0;
    
    public void update(Button m) {
        cycleCount++;
        colorIndex = (colorIndex + 1) % colors.length;
        setBackground(colors[colorIndex]);
        setText("" + cycleCount);
    }
}
