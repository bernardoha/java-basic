package pe.edu.une.prueba;

import pe.edu.une.model.Animal;
import pe.edu.une.model.Gato;
import pe.edu.une.model.Perro;


public class App {
	public static void main(String[] args) {
		//Declarar un objeto de la clase animal
		Animal anim;
		//Crear el objeto del tipo animal
		anim = new Animal("Yeti","Desconocido","Verde","Enorme");
		anim.imprimeInformacion();
		anim.muestraDatos();
		
		//Crear objeto del tipo gato
		System.out.println("***********************************");
		System.out.println("Objeto gato");
		anim = new Gato("Felix","Persa","Blanco","Mediano","Arena simple");
		anim.muestraDatos();
		anim.imprimeInformacion();
		//Crear objeto del tipo perro
		System.out.println("***********************************");
		System.out.println("Objeto perro");
		anim = new Perro("Firulais","Pastor aleman","Negro","Grande","Mi Mascot");
		anim.muestraDatos();
		anim.imprimeInformacion();
		System.out.println("********************************************");
		System.out.println("Mi mascota favorita");
		//Editar nombre con el método set
		anim.setNombre("Bruce");
		//Mostrar el nombre
		System.out.println(anim.getNombre()+" "+anim.getRaza());
		System.out.println("********************************************");
		//Crear una instancia del objeto Perro
		Perro perro1=new Perro("Valentino","Pitbull","blanco","Mediano","Ricocan");
		
	}
}
