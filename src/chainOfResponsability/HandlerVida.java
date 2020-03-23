package chainOfResponsability;

import animacion.Personaje;

public class HandlerVida implements Handler {
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
        System.out.println("La vida es: " + vida);
        if (vida < 100) {
            System.out.println("se aumenta vida");
            vida = 100;
        } else if(vida < 50) {
            vida = vida + 50;
        }else{
            this.next.aumento(vida, escudo, personaje);
        }
        personaje.setVida(vida);
        personaje.setEscudo(escudo);
    }
    
}
