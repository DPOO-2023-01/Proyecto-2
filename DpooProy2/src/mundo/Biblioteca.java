package mundo;

import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca {
	
	private Lector Lector;
	private Escritor Escritor;
	private ArrayList<Huesped> Huespedes;
	private ArrayList<Reserva> Reservas;
	private ArrayList<Servicio> Servicios;
	private ArrayList<Habitacion> Habitaciones;
	private ArrayList<FechasTarifa> Tarifas;
	private ArrayList<Usuario> Usuarios;
	private ArrayList<FacturaServicio> HistorialServicios;
	
	public Biblioteca() {
		Lector = new Lector();
		Escritor = new Escritor();
		
		try {
			Huespedes = Lector.leer("./data/huespedes.txt","Huesped");
			Reservas = Lector.leer("./data/reservas.txt","Reserva");
			Servicios = Lector.leer("./data/servicios.txt","Servicio");
			Habitaciones = Lector.leer("./data/habitaciones.txt","Habitacion");
			Tarifas = Lector.leer("./data/tarifas.txt","FechasTarifa");
			Usuarios = Lector.leer("./data/usuarios.txt","Usuario");
			HistorialServicios = Lector.leer("./data/historialservicios.txt","FacturaServicio");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	
	
	
	
	
	
	public Lector getLector() {
		return Lector;
	}
	public void setLector(Lector lector) {
		Lector = lector;
	}
	public Escritor getEscritor() {
		return Escritor;
	}
	public void setEscritor(Escritor escritor) {
		Escritor = escritor;
	}
	public ArrayList<Huesped> getHuespedes() {
		return Huespedes;
	}
	public void setHuespedes(ArrayList<Huesped> huespedes) {
		Huespedes = huespedes;
	}
	public ArrayList<Reserva> getReservas() {
		return Reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		Reservas = reservas;
	}
	public ArrayList<Servicio> getServicios() {
		return Servicios;
	}
	public void setServicios(ArrayList<Servicio> servicios) {
		Servicios = servicios;
	}
	public ArrayList<Habitacion> getHabitaciones() {
		return Habitaciones;
	}
	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		Habitaciones = habitaciones;
	}
	public ArrayList<FechasTarifa> getTarifas() {
		return Tarifas;
	}
	public void setTarifas(ArrayList<FechasTarifa> tarifas) {
		Tarifas = tarifas;
	}
	public ArrayList<Usuario> getUsuarios() {
		return Usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuarios = usuarios;
	}
	public ArrayList<FacturaServicio> getHistorialServicios() {
		return HistorialServicios;
	}
	public void setHistorialServicios(ArrayList<FacturaServicio> historialServicios) {
		HistorialServicios = historialServicios;
	}
	
	
	
	
	

}
