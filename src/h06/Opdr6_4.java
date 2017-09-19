package h06;


import java.applet.Applet;
import java.awt.*;

public class Opdr6_4 extends Applet {
    int test;
    double a = 5.9;
    double b = 6.3;
    double c = 6.9;
    double d = 3;
    double cijfer1;
    double test;
    double test2;
    double test3;

    public void init(){

      cijfer1 = (a+b+c)/d;
      test = cijfer1 * 10;
      test2 = (int) test;
      test3 = test2 /10;


    }
    public void paint (Graphics g){
        g.drawString("Gemiddelde cijfer =  " +test3,20,20 );

    }


}
