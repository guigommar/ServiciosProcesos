package pMoroYSaco;

public class Principal {
    public static void main(String[] args) {
        Saco sac = new Saco();  // El Sac que gastaran el Moro Musa i l'home del sac


        MoroMusa moroMusa = new MoroMusa(sac);
        HombreDelSaco homeSac = new HombreDelSaco(sac);

        Thread filMoroMusa = new Thread(moroMusa);
        Thread filHomeSac = new Thread(homeSac);

        // Iniciem els dos fils
        filMoroMusa.start();
        filHomeSac.start();

        // Coordinem l'execució dels fils amb join()
        try {
            filMoroMusa.join();  // Espera que el Moro musa disse d'espantar
            filHomeSac.join();  // L'home del sac ja ha tornat
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El moro Musa i l'home del sac s'han ficat les botes");
    }
}
