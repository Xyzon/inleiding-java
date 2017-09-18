package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdr6_1 extends Applet {
    int teller;

    int a;
    int b;
    int c;
    int bedrag;

    public void init() {
        teller = 0;
        a = 56;
        b = 56;
        c = 4;
        bedrag = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("bedrag per persoon: " + bedrag, 20, 20);
    }
}




