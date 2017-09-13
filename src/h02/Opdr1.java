package h02;

import java.applet.Applet;
import java.awt.*;


    //een klasse met de naam Show van het type Applet
    public class Opdr1 extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {
            setBackground(Color.magenta);

        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Welcome to java!!", 50, 60 );
        }
    }






