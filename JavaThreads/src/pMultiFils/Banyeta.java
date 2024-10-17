package pMultiFils;

public class Banyeta extends Thread{
    public void run(){
        int c = 1;
        while (c<6){
            System.out.println("El banyeta compta..." + c);
            c++;
            try{
                this.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Fora de temps");
            }
        }
    }
}
