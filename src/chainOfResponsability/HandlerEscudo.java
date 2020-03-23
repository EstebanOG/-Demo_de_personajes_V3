package chainOfResponsability;

import animacion.Personaje;

public class HandlerEscudo extends Handler{

    @Override
    public void handlerRequest(int vida, int escudo, Personaje per) {
        if (escudo < 100 && escudo > 49) {
            System.out.println("se aumenta escudo");
            escudo = 100;
            per.setEscudo(escudo);
        } else if (escudo < 50) {
            System.out.println("Se aumenta escudo menor a 50");
            escudo = escudo + 50;
            per.setEscudo(escudo);
        } else {
            System.out.println("escudo al máximo");
        }
    }
}
