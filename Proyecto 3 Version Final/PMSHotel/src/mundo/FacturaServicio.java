package mundo;

import java.util.ArrayList;

public class FacturaServicio {
	
	private String Huesped;
	private String Habitacion;
	private String Fecha;
	private Boolean FacturadoAhora;
	private ArrayList<String> Servicios;
	
	public FacturaServicio(String huesped, String habitacion, String fecha, Boolean facturadoAhora, ArrayList<String> servicios) {
		
		this.Huesped=huesped;
		this.Habitacion=habitacion;
		this.Fecha=fecha;
		this.FacturadoAhora=facturadoAhora;
		this.setServicios(servicios);
	}
	
	public String getHuesped() {
		return Huesped;
	}
	public void setHuesped(String huesped) {
		Huesped = huesped;
	}
	public String getHabitacion() {
		return Habitacion;
	}
	public void setHabitacion(String habitacion) {
		Habitacion = habitacion;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public Boolean getFacturadoAhora() {
		return FacturadoAhora;
	}
	public void setFacturadoAhora(Boolean facturadoAhora) {
		FacturadoAhora = facturadoAhora;
	}

	public ArrayList<String> getServicios() {
		return Servicios;
	}

	public void setServicios(ArrayList<String> servicios) {
		Servicios = servicios;
	}

	
	
	

}
