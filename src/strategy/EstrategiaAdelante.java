package strategy;

public class EstrategiaAdelante extends Strategy{

    @Override
    public void llenado() {
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = generarAleatorio();
            System.out.println("generando aleatorio para la poscion " + i + " = " + arreglo[i]);
        }
    }
    
}
