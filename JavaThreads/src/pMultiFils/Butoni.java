package pMultiFils;

import java.util.Random;

public class Butoni extends Thread{

    public void run(){

        int c = 6;
        while (c<11){
            System.out.println("El butoni compta..." + c);
            c++;
            try{
                this.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Fora de temps");
            }
        }

    }
}
