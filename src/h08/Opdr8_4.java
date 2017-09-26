package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8_4 extends Applet implements ActionListener {

    Label l1, l2;
    TextField t1, t2, t3;
    Button plus, min, keer, delen;

    public void init() {
        l1 = new Label("Voer een getal in");
        add(l1);

        l2 = new Label("Getal2");
        add(l2);

        t1 = new TextField(10);
        add(t1);

        t2 = new TextField(10);
        add(t2);

        t3 = new TextField(10);
        add(t3);


        plus = new Button("+");
        add(plus);
        plus.addActionListener(this);


        min = new Button("-");
        add(min);
        min.addActionListener(this);

        keer = new Button("*");
        add(keer);
        keer.addActionListener(this);

        delen = new Button("/");
        add(delen);
        delen.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == plus) {
            int plus = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(plus));
        }

        if (ae.getSource() == min) {
            int min = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(min));
        }


        if (ae.getSource() == keer) {
            int keer = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(keer));
        }


        if (ae.getSource() == delen) {
            int delen = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(delen));
        }

    }

}


