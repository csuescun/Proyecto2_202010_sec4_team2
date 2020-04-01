package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Cargar datos");
			System.out.println("2. Obtener los M comparendos con mayor gravedad");
			System.out.println("3. Buscar comparendos por mes y día de la semana");
			System.out.println("4. Buscar comparendos por rango de fecha-hora y localidad dada.");
			System.out.println("5. Obtener los M comparendos más cercanos a la estación de policia");
			System.out.println("6. Buscar los comparendos por medio de detección, clase de vehículo, tipo de servicio y localidad.");
			System.out.println("7. Buscar comparendos por rango de latitud y tipo de vehiclo");
			System.out.println("8. Visualizar Datos en una Tabla ASCII");
			System.out.println("9. Visualizar costo de los tiempos de espera hoy en día");
			System.out.println("10. Visualizar costo de los tiempos de espera usando el nuevo sistema");
			System.out.println("11. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
	
}
