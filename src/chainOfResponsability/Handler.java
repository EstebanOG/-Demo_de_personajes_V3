package chainOfResponsability;

import animacion.Personaje;

public interface Handler {
        /* Asigna el siguiente jerarca en la cadena de responsabilidad*/
	public void setNext (Handler pHandler);
	
	/*Retorna el siguiente jerarca en la cadena de responsabilidad*/
	public Handler getNext();
	
	/*aumenta escudo o vida segun corresponda*/
	public  void aumento(int vida, int escudo, Personaje personaje);

}
