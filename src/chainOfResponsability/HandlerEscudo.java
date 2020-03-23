package chainOfResponsability;

import animacion.Personaje;

public class HandlerEscudo implements Handler{
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
        if (escudo < 100 && escudo > 49) {
            System.out.println("se aumenta escudo");
            escudo = 100;
        } else if(escudo < 50) {
            System.out.println("Se aumenta escudo menor a 50");
            escudo = escudo + 50;
        }else{
            System.out.println("escudo al máximo");
        }
        personaje.setVida(vida);
        personaje.setEscudo(escudo);
    }
    
}
