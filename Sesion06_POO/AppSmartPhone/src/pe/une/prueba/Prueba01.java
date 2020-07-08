package pe.une.prueba;

import pe.une.model.SmartPhone;

public class Prueba01 {

	public static void main(String[] args) {
		//Crear un objeto del tipo SmartPhone con constructor vacío
		SmartPhone celular = new SmartPhone();
		//Crear un objeto del tipo SmartPhone con parámetros
		SmartPhone celular2 = new SmartPhone("Samsung","A70","Azul");
		
		//Asignar datos al objeto -> marca, modelo y color
		celular.setMarca("Huawei");
		celular.setModelo("P30");
		celular.setColor("Dorado");
		//Modificar datos utilizando el método set
		celular2.setModelo("S10");
		
		//Llamar a un método de la clase SmartPhone
		celular.llamar();
		celular2.llamar2("Faustino");
		String mensaje=celular.mostrarMensaje("Flavia");
		System.out.println(mensaje);
		
		//Consultar datos usando el método get
		System.out.println(celular.getMarca()+" "+celular.getModelo()+" "+celular.getColor());
		System.out.println(celular2.getMarca()+" "+celular2.getModelo()+" "+celular2.getColor());
	}

}
