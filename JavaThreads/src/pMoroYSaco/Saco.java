package pMoroYSaco;

public class Saco{
    private boolean xiquet = false;

    public synchronized void xiquetEspantat() {
        while (xiquet) {
            try {
                wait();  // El xiquet corre per la seua vida
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Un xiquet corre per la seua vida");
        xiquet = true; //Me quedaré al wait de dal
        notifyAll();  // Avisa que hi ha un xiquet correns
    }

    public synchronized void xiquetAlSac() {
        while (!xiquet) {
            try {
                wait();  // Espera fins que se trobe un xiquet
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El xiquet esta al sac i ben lligat");
        xiquet = false;
        notifyAll();  // Avisa que el xiquet esta al sac
    }
}
