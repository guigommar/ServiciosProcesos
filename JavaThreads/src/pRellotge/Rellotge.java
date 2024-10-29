package pRellotge;

import javax.swing.*;
//import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rellotge extends JFrame implements Runnable {

    private Thread fil = null;
    private Font font;
    private String horaActual="";

    public Rellotge() {
        setVisible(true);
        setTitle("Rellotge");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        font = new Font("Verdana", Font.BOLD, 26);

        start();
    }
    public void init(){
        font = new Font("Verdana",Font.BOLD,26);
    }

    public void start(){
        if(fil == null){
            fil = new Thread(this);
            fil.start();
        }
    }

    @Override
    public void run() {
        Thread filActual = Thread.currentThread();
        while(fil==filActual){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            horaActual = sdf.format(cal.getTime());

            repaint();

            try{
               Thread.sleep(3000);
            }catch (InterruptedException e){}
        }
    }

    public void stop(){
        fil = null;
    }

    public void paint(Graphics g){
        g.clearRect(1,1,getSize().width,getSize().height);
        setBackground(Color.YELLOW);
        g.setFont(font);
        g.drawString(horaActual,80,200);
    }

    public static void main(String[] args){
        Rellotge rellotge = new Rellotge();


    }
}
