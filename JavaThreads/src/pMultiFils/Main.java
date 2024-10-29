package pMultiFils;

public class Main {
    public static void main(String[] args) {
        /* ACTIVITAT 1
        TombaTossals t = null;
        for (int i = 0 ; i < 10 ; i ++){
            t = new TombaTossals();
            t.start();
            try{
            t.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Fora de temps");
            }
        }
       */
        /* ACTIVITAT 2
        Banyeta banyeta = new Banyeta();
        Butoni butoni = new Butoni();
        banyeta.start();
        try {
            banyeta.join();
        }catch (Exception exception){
            System.out.println("Error");
        }
        butoni.start();
        */

        ButoniAct3 b3 = new ButoniAct3();
        HomeDelsNassos h = new HomeDelsNassos();
        b3.start();


    }
}
