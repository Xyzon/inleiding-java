package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_2 extends Applet{

    TextField tekstvak1,tekstvak2;
    Label label;
    double uitkomst,uitkomst2, antwoord, antwoord2;
    String s,d;


    public void init (){

        tekstvak1=new TextField("",20);
        tekstvak2=new TextField("",20);
        tekstvak1.addActionListener( new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        label=new Label("typ 2 cijfers en druk op enter");
        add(label);
        add(tekstvak1);
        add(tekstvak2);
        // s

    }

    public void paint(Graphics g){
        g.drawString("hoogste getal :  "+antwoord,100,100);
        g.drawString("laagste getal :  "+antwoord2,100,150);

    }

    class TekstvakListener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            s= tekstvak1.getText();
            d= tekstvak2.getText();
            uitkomst = Integer.parseInt(s);
            uitkomst2 = Integer.parseInt(d);

            if (uitkomst > uitkomst2){
                antwoord = uitkomst;
            }
            else  {
                antwoord = uitkomst2;
            }

            if (uitkomst> uitkomst2) {
                antwoord2 = uitkomst2;
            }
            else{
                antwoord2=uitkomst;
            }

            repaint();
        }

    }

}
