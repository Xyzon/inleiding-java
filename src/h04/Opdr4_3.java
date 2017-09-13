package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4_3 extends Applet {

    public void init(){
    }
    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);
        g.fillRect(10,10,5,250);
        g.setColor(Color.RED);
        g.fillRect(15 ,10,100,25);
        g.setColor(Color.WHITE);
        g.fillRect(15 ,35,100,25);
        g.setColor(Color.blue);
        g.fillRect(15 ,60,100,25);

    }

}
