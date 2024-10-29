package pHome_Monstre;

public class Home_dels_Nassos extends Home_monstre implements  Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            apareixer();
            System.out.println("Home del nassos mostra els seus nassos!");
            ferSoroll();
            desapareixer();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
