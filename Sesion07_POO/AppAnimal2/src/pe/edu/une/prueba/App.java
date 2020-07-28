package pe.edu.une.prueba;

import pe.edu.une.model.Gato;
import pe.edu.une.model.Hamster;
import pe.edu.une.model.Perro;

public class App {
	public static void main(String[] args) {
		System.out.println("********************");
		System.out.println("Objeto Perro");
		Perro p = new Perro("Firulais","Pastor Aleman","Negro","Grande","Mi mascot");
		p.muestraDatos();
		p.imprimeInformacion();
		System.out.println("********************");
		System.out.println("Objeto Gato");
		Gato g = new Gato("Felix","Persa","Blanco","Mediano","Arena simple");
		g.muestraDatos();
		g.imprimeInformacion();
		System.out.println("********************");
		System.out.println("Objeto Hamster");
		Hamster h = new Hamster("Tito","Cambell","Gris","Mediano","Rueda de plastico","Jaula de alambre");
		h.muestraDatos();
		h.imprimeInformacion();
		h.verJaulaRueda();
	}
}
