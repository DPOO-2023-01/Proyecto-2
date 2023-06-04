package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorHabitaciones {
private ArrayList <habitacion> Habitaciones;
	
	public LectorHabitaciones() {
		
		setHabitaciones(new ArrayList <habitacion>());
		
		try {
			leer("./Data/habitaciones.txt");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void leer(String nombre) throws IOException{
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String ID = datos[0];
			Boolean Reservada = Boolean.parseBoolean(datos[1]);
			double Precio = Double.parseDouble(datos[2]);
			String Tipo = datos[3];
			int CantidadMax = Integer.parseInt(datos[4]);
			Boolean vista = Boolean.parseBoolean(datos[5]);
			Boolean cocina = Boolean.parseBoolean(datos[6]);
			Boolean balcon = Boolean.parseBoolean(datos[7]);
			
			
			habitacion nueva = new habitacion(ID,Reservada,Precio,Tipo,CantidadMax,vista,cocina,balcon);
			Habitaciones.add(nueva);
			
			linea = lector.readLine();
		}
		lector.close();
	}



	public ArrayList <habitacion> getHabitaciones() {
		return Habitaciones;
	}



	public void setHabitaciones(ArrayList <habitacion> habitaciones) {
		Habitaciones = habitaciones;
	}
	
}

