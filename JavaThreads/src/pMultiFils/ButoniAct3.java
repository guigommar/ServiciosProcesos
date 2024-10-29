package pMultiFils;

public class ButoniAct3 extends Thread{
    private int[] numeros = new int[5];
    private int index = 0;

    public synchronized void generar(){
        while(index == numeros.length){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (int i = 0; i < numeros.length ; i ++){
            int n = (int)(Math.random() * 1000) + 1;
            numeros[i] = n;
            notify();

        }
    }
}
