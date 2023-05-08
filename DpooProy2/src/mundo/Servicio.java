package mundo;

public class Servicio {
	
	private String ID;
	private int Cantidad;
	private double Precio;
	private Boolean Portatil;
	private Boolean Tipo;
	
	public Servicio(String id, Boolean tipo, int cantidad, double precio, Boolean portatil) {
		
		this.setID(id);
		this.setCantidad(cantidad);
		this.setPrecio(precio);
		this.setPortatil(portatil);
		this.setTipo(tipo);
		
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
