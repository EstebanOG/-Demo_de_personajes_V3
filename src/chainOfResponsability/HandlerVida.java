package chainOfResponsability;

import animacion.Personaje;

public class HandlerVida extends Handler {

    @Override
    public void handlerRequest(int vida, int escudo, Personaje per) {
        if (vida < 100 && vida > 49) {
            System.out.println("se aumenta vida");
            vida = 100;
            per.setVida(vida);
        } else if (vida < 50) {
            System.out.println("Vida menor a 50");
            vida = vida + 50;
            per.setVida(vida);
        } else {
            successor.handlerRequest(vida, escudo, per);
        }
    }

}
