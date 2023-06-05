package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Lector {

	public Lector() {
	}

	
	public ArrayList leer(String nombre,String tipo) throws IOException{
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		
		if (tipo.equals("Huesped")) {
		
			ArrayList<Huesped> lista = new ArrayList<Huesped>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String ID = datos[0];
				String Cedula = datos[1];
				String Email = datos[2];
				String Telefono = datos[3];
			
				Huesped nuevo = new Huesped(ID,Cedula,Email,Telefono);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		
		else if (tipo.equals("Habitacion")) {
			
			ArrayList<Habitacion> lista = new ArrayList<Habitacion>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String ID = datos[0];
				String Tipo = datos[1];
				Boolean Vista = Boolean.parseBoolean(datos[2]);
				Boolean Cocina = Boolean.parseBoolean(datos[3]);
				Boolean Balcon = Boolean.parseBoolean(datos[4]);
				Boolean Ocupacion = Boolean.parseBoolean(datos[5]);
				int CapacidadMax = Integer.parseInt(datos[6]);
				
				
			
				Habitacion nuevo = new Habitacion(ID,Tipo,Vista,Cocina,Balcon,Ocupacion,CapacidadMax);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		else if (tipo.equals("FechasTarifa")) {
			
			ArrayList<FechasTarifa> lista = new ArrayList<FechasTarifa>();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
			
			while(linea!=null) {
				
				String [] datos = linea.split(";");
				String ID = datos[0];
				
				try {
				Date FechaIni = sdf.parse(datos[1]);
				Date FechaFin = sdf.parse(datos[2]);
				Double Cambio = Double.parseDouble(datos[3]);
				FechasTarifa nuevo = new FechasTarifa(ID,FechaIni,FechaFin,Cambio);
				lista.add(nuevo);
				linea = lector.readLine();}
				
				catch (ParseException e) {}
			}return lista;}
		else if (tipo.equals("Servicio")) {
			
			ArrayList<Servicio> lista = new ArrayList<Servicio>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String ID = datos[0];
				Boolean Tipo = Boolean.parseBoolean(datos[1]);
				int Cantidad = Integer.parseInt(datos[2]);
				Double Precio = Double.parseDouble(datos[3]);
				Boolean Portatil = Boolean.parseBoolean(datos[4]);
				int Ventas = Integer.parseInt(datos[5]);
				Date fecha = new Date();
				
				Servicio nuevo = new Servicio(ID,Tipo,Cantidad,Precio,Portatil,Ventas, fecha);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		else if (tipo.equals("Reserva")) {
			
			ArrayList<Reserva> lista = new ArrayList<Reserva>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String ID = datos[0];
				String [] huesped = datos[1].split(":");
				ArrayList<String> huespedes = new ArrayList<>();
				for (String nombre1 : huesped) {
					huespedes.add(nombre1);
				}
				String [] habitacion = datos[2].split(":");
				ArrayList<String> habitaciones = new ArrayList<>();
				for (String nombre1 : habitacion) {
					habitaciones.add(nombre1);
				}
				String [] fecha = datos[3].split(":");
				ArrayList<String> fechas = new ArrayList<>();
				for (String nombre1 : fecha) {
					fechas.add(nombre1);
				}
				
				Reserva nuevo = new Reserva(ID,huespedes,habitaciones,fechas);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		else if (tipo.equals("Usuario")) {
			
			ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String ID = datos[0];
				String Tipo = datos[1];
				String Nombre = datos[2];
				String Contrasena = datos[3];
				
				Usuario nuevo = new Usuario(ID,Tipo,Nombre,Contrasena);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		else if (tipo.equals("FacturaServicio")) {
			
			ArrayList<FacturaServicio> lista = new ArrayList<FacturaServicio>();
		
			while(linea!=null) {
			
				String [] datos = linea.split(";");
				String Huesped = datos[0];
				String Habitacion = datos[1];
				String Fecha = datos[2];
				Boolean FacturadoAhora = Boolean.parseBoolean(datos[3]);
				String [] servicio = datos[4].split(":");
				ArrayList<String> servicios = new ArrayList<>();
				for (String nombre1 : servicio) {
					servicios.add(nombre1);
				}
				FacturaServicio nuevo = new FacturaServicio(Huesped,Habitacion,Fecha,FacturadoAhora,servicios);
				lista.add(nuevo);
			
				linea = lector.readLine();
			}return lista;}
		else {ArrayList lista = new ArrayList();return lista;}
	}

}
