package pHome_Monstre;

public class Home_del_Sac extends Home_monstre implements Runnable{

    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            apareixer();
            System.out.println("Home del Sac agafa un xiquet amb el seu sac!");
            desapareixer();
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
