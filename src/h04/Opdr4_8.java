package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdr4_8 extends Applet {

    public void init(){
    }

    public void paint (Graphics g) {
        setBackground(Color.white);
        //line
        g.drawLine(300,10,10,10);
        g.drawString("lijn",150,25);

        //Rechthoek
        g.drawRect(10,30,290,135);
        g.drawString("rechthoek",125,180);

        //Afgeronde rechthoek
        g.drawRoundRect(5,190,300,150,100,100);
        g.drawString("Afgeronde Rechthoek",100,360);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(330,20,280,140);
        g.setColor(Color.black);
        g.drawOval(330,20,280,140);
        g.drawString("Gevulde rechthoek met ovaal",390,185);

        //Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(330,200,280,140);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",430,370);

        //Taartpunt met ovaal eromheen
        g.drawOval(650,20,280,140);
        g.setColor(Color.MAGENTA);
        g.fillArc(650,20,280,140,360,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",700,180);

        //Cirkel
        g.drawOval(700,220,100,100);
        g.drawString("Cirkel",735,350);
    }


}

