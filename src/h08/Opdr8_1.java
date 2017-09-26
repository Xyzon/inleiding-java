package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8_1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    Button Reset;
    String s = "";


    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("Typ iets in het tekstvak " +
                "en druk op de knop");
        tekstvak.addActionListener(new KnopListener());
        tekstvak.addActionListener(new KnopListener1());
        add(label);
        add(tekstvak);
        s = "";

        //knop 1
        knop = new Button("Ok");
        KnopListener lk = new KnopListener();
        knop.addActionListener((lk));
        add(knop);

        //knop 2
        Reset = new Button();
        Reset.setLabel("Reset");
        KnopListener1 ll = new KnopListener1();
        Reset.addActionListener(ll);
        add(Reset);

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekstvak.setText("");
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            s = "";
            repaint();
        }
    }


}
