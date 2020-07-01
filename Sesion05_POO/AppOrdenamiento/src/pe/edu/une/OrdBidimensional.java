package pe.edu.une;

public class OrdBidimensional {
	public static void main(String[] args) {
		// Crear arreglo y asignar datos
		double aportes[][]= {{4000,4000,1500,9500},
							 {1200,2300,4500,8000},
							 {1400,5000,4500,10900}};
		//Ordenar datos
		for (int i = 0; i < aportes.length-1; i++) {
			for (int j = 0; j < aportes.length-1; j++) {
				//Ordenar en forma descendente con base a columna3
				if(aportes[j][3]<aportes[j+1][3]) {
					//Ordenar columna 0
					double aux0 = aportes[j+1][0];
					aportes[j+1][0]=aportes[j][0];
					aportes[j][0]=aux0;
					//Ordenar columna 1
					double aux1 = aportes[j+1][1];
					aportes[j+1][1]=aportes[j][1];
					aportes[j][1]=aux1;
					//Ordenar columna 2
					double aux2 = aportes[j+1][2];
					aportes[j+1][2]=aportes[j][2];
					aportes[j][2]=aux2;
					//Ordenar columna 3
					double aux3 = aportes[j+1][3];
					aportes[j+1][3]=aportes[j][3];
					aportes[j][3]=aux3;
				}
			}
		}//Fin de for
		//Mostrar datos
		System.out.println("Aporte1 \t Aporte2 \t\t Aporte3 \t Total");
		for (int i = 0; i < aportes.length; i++) {
			System.out.println(aportes[i][0]+" \t\t "+aportes[i][1]+
					" \t\t"+aportes[i][2]+" \t\t "+aportes[i][3]);
		}
	}

}
