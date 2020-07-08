package pe.une.prueba;

import pe.une.model.SmartPhone;

public class Prueba01 {

	public static void main(String[] args) {
		//Crear un objeto del tipo SmartPhone con constructor vac�o
		SmartPhone celular = new SmartPhone();
		//Crear un objeto del tipo SmartPhone con par�metros
		SmartPhone celular2 = new SmartPhone("Samsung","A70","Azul");
		
		//Asignar datos al objeto -> marca, modelo y color
		celular.setMarca("Huawei");
		celular.setModelo("P30");
		celular.setColor("Dorado");
		//Modificar datos utilizando el m�todo set
		celular2.setModelo("S10");
		
		//Llamar a un m�todo de la clase SmartPhone
		celular.llamar();
		celular2.llamar2("Faustino");
		String mensaje=celular.mostrarMensaje("Flavia");
		System.out.println(mensaje);
		
		//Consultar datos usando el m�todo get
		System.out.println(celular.getMarca()+" "+celular.getModelo()+" "+celular.getColor());
		System.out.println(celular2.getMarca()+" "+celular2.getModelo()+" "+celular2.getColor());
	}

}
