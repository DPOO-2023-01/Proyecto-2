package mundo;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Servicio {
	
	private String ID;
	private int Cantidad;
	private double Precio;
	private Boolean Portatil;
	private Boolean Tipo;
	private int Ventas;
	private Date fecha;
	
	public Servicio(String id, Boolean tipo, int cantidad, double precio, Boolean portatil, int ventas, Date fecha) {
		
		this.setID(id);
		this.setCantidad(cantidad);
		this.setPrecio(precio);
		this.setPortatil(portatil);
		this.setTipo(tipo);
		this.setVentas(ventas);
		this.setfecha(fecha);
		
	}

	private void setfecha(Date fecha2) {
		fecha = fecha;
	}
	
	public String getMes() {
        LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Month month = localDate.getMonth();
        return month.toString();
    }


	private void setVentas(int ventas) {
		Ventas = ventas;
		
	}

	public Boolean getPortatil() {
		return Portatil;
	}

	public void setPortatil(Boolean portatil) {
		Portatil = portatil;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Boolean getTipo() {
		return Tipo;
	}

	public void setTipo(Boolean tipo) {
		Tipo = tipo;
	}

	public int getCantidad() {
		return Cantidad;
	}
	
	public int getVentas() {
		return Ventas;
	}

	public void setCantidad(int cantidad2) {
		Cantidad = cantidad2;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
