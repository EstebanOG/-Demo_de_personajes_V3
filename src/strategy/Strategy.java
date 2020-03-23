package strategy;

import java.util.Random;

public abstract class Strategy {
    public Random rand = new Random();
    public int[] arreglo = new int[10];
    
    public int generarAleatorio(){
        return rand.nextInt(100);
    }
    
    public abstract void llenado();
}
