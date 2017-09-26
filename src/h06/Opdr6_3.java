package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdr6_3 extends Applet {

    int b = 147483647;
    int a = 147483647;
    int antwoord;

    public void init() {
        antwoord = a * b;

    }

    public void paint(Graphics g) {
        g.drawString("negatief getal  " + antwoord, 60, 60);
    }
}
