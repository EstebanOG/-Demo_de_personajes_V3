package chainOfResponsability;

import animacion.Personaje;

public class Verificar implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler pHandler) {
        this.next = pHandler;
    }
    
    @Override
    public Handler getNext() {
        return this.next;
    }

    @Override
    public void aumento(int vida, int escudo, Personaje personaje) {
        
        /* Se crean los integrantes de la cadena */
        HandlerVida vidaActualizada = new HandlerVida(); 
        HandlerEscudo escudoActualizado = new HandlerEscudo();
        
        /* Se asigna el primer encargado en la cadena */
        this.next = vidaActualizada;
        
        /* Se asignan la jerarquia en la cadena de responsabilidades */
        vidaActualizada.setNext(escudoActualizado);
        
        /* Se inicia la cadena */
        this.next.aumento(vida, escudo, personaje);
        System.out.println("esto se ejecuta");
    }
    
}
