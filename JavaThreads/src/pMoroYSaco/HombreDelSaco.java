package pMoroYSaco;

public class HombreDelSaco implements Runnable{
    private Saco sac;

    public HombreDelSaco(Saco sac) {
        this.sac = sac;
    }

    public void run() {
        try {
            Thread.sleep(100);  // L'home del sac es menja el xiquet
            System.out.println("Home del sac: Comença l'acció");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            sac.xiquetAlSac(); // Tinc el xiquet al sac
            System.out.println("HomeSac: xiquet al sac: "+i);
            try {
                Thread.sleep(1000);  // L'home del sac es menja el xiquet
                System.out.println("HomeSac: M'he cruspit al xiquet "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
