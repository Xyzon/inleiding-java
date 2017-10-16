package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Challengejava1 extends Applet {

    int  nulpunt;
    int invoerv,invoerj,invoerh;
    Label label;
    Button knop;
    TextField tekstvakval,tekstvakjer,tekstvakhan;
    String val, jer, han;

    int valerie, jeroen, hans;

    public void init() {
        setSize(500, 300);


        knop=new Button("Toon");
        knop.addActionListener(new KnopListener());
        add(knop);

        //Valerie
        valerie = 0;
        tekstvakval=new TextField("", 5);
        add(tekstvakval);

        //Hans
        hans = 0;
        tekstvakhan=new TextField("", 5);
        add(tekstvakhan);

        //Jeroen
        jeroen = 0;
        tekstvakjer=new TextField("",5);
        add(tekstvakjer);

        //Begin lijn
        nulpunt=250;


    }

    public void paint(Graphics g) {


        //Tabel
        g.setColor(Color.black);
        g.drawRect(50, 50, 5, 200);
        g.drawRect(50, 250, 400, 5);


        //de verdeling
        g.drawString("0", 40, 260);
        g.drawString("20", 30, 220);
        g.drawString("40", 30, 180);
        g.drawString("60", 30, 140);
        g.drawString("80", 30, 100);
        g.drawString("100", 25, 60);

        //valerie
        g.setColor(Color.black);
        g.drawString("Valerie", 120, 270);
        g.setColor(Color.pink);
        g.fillRect(100, nulpunt - valerie*2, 75, valerie*2);

        //Hans
        g.setColor(Color.black);
        g.drawString("Hans", 220, 270);
        g.setColor(Color.blue);
        g.fillRect(200, nulpunt - hans*2, 75, hans*2);

        //jeroen
        g.setColor(Color.black);
        g.drawString("jeroen", 320, 270);
        g.setColor(Color.red);
        g.fillRect(300, nulpunt - jeroen*2, 75, jeroen*2);

        //x- en y-as
        g.setColor(Color.black);
        g.drawString("persoon", 220, 300);

        g.drawString("Gewicht", 20, 20);

        g.drawString("Made by Joey Clazing", 1300, 20);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jer= tekstvakjer.getText();
            invoerj= Integer.parseInt(jer);
            jeroen=invoerj;

            val=tekstvakval.getText();
            invoerv= Integer.parseInt(val);
            valerie=invoerv;

            han=tekstvakhan.getText();
            invoerh= Integer.parseInt(han);
            hans=invoerh;


            repaint();
        }
    }
}