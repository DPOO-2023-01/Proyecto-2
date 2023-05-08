package mundo;

import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Calendar;

public class Reserva {
	
	private String HuespedPrincipal;
	private ArrayList<String> HuespedesAdicionales;
	private ArrayList<String> Habitaciones;
	private ArrayList<String> Fechas;
	
	public Reserva(String huespedPrincipal, ArrayList<String> huespedesAdicionales, ArrayList<String> habitaciones, ArrayList<String> fechas) {
		
		this.setHuespedPrincipal(huespedPrincipal);
		this.setHuespedesAdicionales(huespedesAdicionales);
		this.setHabitaciones(habitaciones);
		this.setFechas(fechas);
	}


	public ArrayList<String> getHuespedesAdicionales() {
		return HuespedesAdicionales;
	}

	public void setHuespedesAdicionales(ArrayList<String> huespedesAdicionales) {
		HuespedesAdicionales = huespedesAdicionales;
	}

	public ArrayList<String> getHabitaciones() {
		return Habitaciones;
	}

	public void setHabitaciones(ArrayList<String> habitaciones) {
		Habitaciones = habitaciones;
	}

	public ArrayList<String> getFechas() {
		return Fechas;
	}

	public void setFechas(ArrayList<String> fechas) {
		Fechas = fechas;
	}


	public String getHuespedPrincipal() {
		return HuespedPrincipal;
	}


	public void setHuespedPrincipal(String huespedPrincipal) {
		HuespedPrincipal = huespedPrincipal;
	}
	
}
