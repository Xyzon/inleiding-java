package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8_2 extends Applet {
    TextField tekstvak;
    Label label;
    Button knoppotentvrouw;
    Button knopman;
    Button knopvrouw;
    Button knoppotentman;
    String s = "";
    int man;
    int vrouw;
    int potman;
    int potvrouw;
    int totaal;


    public void init() {

        //knopman
        knopman = new Button("Heren");
        KnopListener la = new KnopListener();
        knopman.addActionListener(la);
        add(knopman);

        //knopvrouw
        knopvrouw = new Button("Dames");
        knopvrouw.setLabel("Dames");
        KnopListener1 lb = new KnopListener1();
        knopvrouw.addActionListener(lb);
        add(knopvrouw);

        //knop potentiele man
        knoppotentman = new Button("Potentiele heren");
        knoppotentman.setLabel("Potentiele Heren");
        KnopListener2 lc = new KnopListener2();
        knoppotentman.addActionListener(lc);
        add(knoppotentman);

        //knop potentiele vrouw
        knoppotentvrouw = new Button("Potentiele dames");
        knoppotentvrouw.setLabel("Potentiele Dames");
        KnopListener3 ld = new KnopListener3();
        knoppotentvrouw.addActionListener(ld);
        add(knoppotentvrouw);

    }

    public void paint(Graphics g) {
        totaal = man + vrouw + potman + potvrouw;
        g.drawString(s, 50, 80);
        g.drawString("Mannen: " + man, 10, 80);
        g.drawString("Vrouwen: " + vrouw, 10, 90);
        g.drawString("Potentiele mannen: " + potman, 10, 100);
        g.drawString("Potentiele Vrouwen: " + potvrouw, 10, 110);
        g.drawString("Totaal: " + totaal, 10, 120);


    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            man++;
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            potman++;
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            potvrouw++;
            repaint();
        }
    }
}








