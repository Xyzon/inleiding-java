package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr10_1 extends Applet{
    private TextField tekstvak1,tekstvak2;
    private Label label;
    private double uitkomst,a,b,uitkomst2, antwoord;
    private String s,d;


    public void init (){

        tekstvak1=new TextField("",20);
        tekstvak2=new TextField("",20);
        tekstvak1.addActionListener( new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        label=new Label("typ 2 cijfers en druk op enter");
        add(label);
        add(tekstvak1);
        add(tekstvak2);

    }

    public void paint(Graphics g){
        g.drawString("hoogste getal :  "+antwoord,100,100);

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
            repaint();
        }

    }
}
