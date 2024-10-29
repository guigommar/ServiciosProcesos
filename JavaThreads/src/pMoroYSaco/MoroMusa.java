package pMoroYSaco;

public class MoroMusa implements Runnable{
    private Saco sac; //me cal un sac per espantar xiquets

    public MoroMusa(Saco sac) {
        this.sac = sac;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("EL moro musa ha espantat al xiquet - "+i);
            sac.xiquetEspantat();  // El Moro Musa Espanta un xiquet

            try {
                //System.out.println("EL moro musa se Gita a dormir");
                Thread.sleep(1000);  // Descansa el moro Musa
                //System.out.println("EL moro musa se desperta de la becaina");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
