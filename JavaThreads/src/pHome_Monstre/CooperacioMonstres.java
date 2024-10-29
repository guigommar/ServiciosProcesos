package pHome_Monstre;

public class CooperacioMonstres {
    public static void main(String[] args) {
        Home_dels_Nassos homeDelsNassos = new Home_dels_Nassos();
        Home_del_Sac homeDelSac = new Home_del_Sac();

        Thread filNassos = new Thread(homeDelsNassos);
        Thread filSac = new Thread(homeDelSac);

        filNassos.start();

        try{
            filNassos.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filSac.start();
    }
}
