package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdr5_2 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogteJ;
    int hoogteV;
    int hoogteH;


    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 40;
        hoogteJ = 175;
        hoogteV = 85;
        hoogteH = 150;

    }
    public void paint(Graphics g){
        g.drawString("100", 0, 50 );
        g.drawString("80", 0, 80 );
        g.drawString("60", 0, 110 );
        g.drawString("40", 0, 140 );
        g.drawString("20", 0, 170 );
        g.drawString("0", 0, 200 );
        g.drawRect(25,0,2,220);
        g.drawRect(25,220,300,2);

        //Valerie
        g.setColor(Color.PINK);
        g.drawString("Valerie", 30,235);
        g.fillRect(35,135,breedte ,hoogteV);

        //Jeroen
        g.setColor(Color.BLUE);
        g.drawString("Jeroen", 120,235);
        g.fillRect(120,45,breedte,hoogteJ);

        //Hans
        g.setColor(Color.red);
        g.drawString("Hans", 220,235);
        g.fillRect(220,70,breedte,hoogteH);

    }


}