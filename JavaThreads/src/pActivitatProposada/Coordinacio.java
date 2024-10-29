package pActivitatProposada;

public class Coordinacio {
    public static void main(String[] args) {
        Home_del_Sac homeDelSac = new Home_del_Sac();
        Home_dels_Nassos homeDelsNassos = new Home_dels_Nassos();

        Thread filNassos = new Thread(homeDelsNassos);
        Thread filSac = new Thread(homeDelSac);

        filNassos.start();
        try {
            filNassos.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filSac.start();
    }
}
