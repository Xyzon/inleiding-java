package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_3 extends Applet {



        TextField tekstvak;
        Label label;
        String s, tekst;
        int dag;

        public void init() {
            tekstvak = new TextField("", 20);
            label = new Label("TYp de nummer van de maand en druk op Enter.");
            tekstvak.addActionListener( new TekstvakListener() );
            tekst = "";
            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 50, 60 );
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                dag = Integer.parseInt( s);
                switch(dag) {
                    case 1:
                        tekst = "januari 31 dagen";
                        break;
                    case 2:
                        tekst = "Maand: Februari 28 dagen";
                        break;
                    case 3:
                        tekst = "Maand: Maart 31 dagen";
                        break;
                    case 4:
                        tekst = "Maand: April 30 dagen";
                        break;
                    case 5:
                        tekst = "Maand: Mei 31 dagen";
                        break;
                    case 6:
                        tekst = "Maand: Juni 30 dagen";
                        break;
                    case 7:
                        tekst = "Maand: Juli 31 dagen";
                        break;
                    case 8:
                        tekst = "Maand: Augustus 31 dagen";
                        break;
                    case 9:
                        tekst = "Maand: September 30 dagen";
                        break;
                    case 10:
                        tekst = "Maand: Oktober 31 dagen";
                        break;
                    case 11:
                        tekst = "Maand: November 30 dagen";
                        break;
                    case 12:
                        tekst = "Maand: December 31 dagen";
                        break;
                    default:
                        tekst = "Deze bestaat niet..";
                        break;
                }
                repaint();
            }
        }
    }
