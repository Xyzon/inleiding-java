package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdr5_1 extends Applet {

    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //rechthoek
        g.drawRect(100, 100, breedte, hoogte);

        //ronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        //gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);

        //ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        //Taartpunt met ovaal
        g.setColor(lijnkleur);
        g.drawOval(550,100,breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(550,100,breedte,hoogte,360,45);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(56, 0,225,100);
    }

}
