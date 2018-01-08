package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_5 extends Applet{

    TextField tekstvak;
    Label label;
    String s,tekst;
    int cijfer;

    public void init(){
        tekstvak= new TextField("",20);
        label=new Label("Typ een getal");
        tekstvak.addActionListener(new Tekstvaklistener());
        tekst="";
        add (label);
        add(tekstvak);
    }
    public void paint(Graphics g){
        g.drawString("het getal is  "+ tekst,80,100);
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s=tekstvak.getText();
            cijfer=Integer.parseInt(s);
            switch (cijfer){
                case 1:
                    tekst="slecht";
                    break;
                case 2:
                    tekst="slecht";
                    break;
                case 3:
                    tekst="slecht";
                    break;
                case 4:
                    tekst="onvoldoende";
                    break;
                case 5:
                    tekst="matig";
                    break;
                case 6:
                    tekst="voldoende";
                    break;
                case 7:
                    tekst="voldoende";
                    break;
                case 8:
                    tekst="goed";
                    break;
                case 9:
                    tekst="goed";
                    break;
                case 10:
                    tekst="goed";
                    break;
                default:
                    tekst="verkeerde cijfer ";
                    break;

            }
            repaint();

        }
    }
}

