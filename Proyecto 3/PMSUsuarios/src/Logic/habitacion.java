package Logic;

public class habitacion {
	
	private String ID;
	private Boolean reservada;
	private double precio;
	private String Tipo;
	private int CantidadMax;
	private Boolean Vista;
	private Boolean Cocina;
	private Boolean Balcon;
	
	public habitacion(String id, Boolean Reservada, double Precio, String tipo, int Cantidadmax, Boolean vista, Boolean cocina, Boolean balcon) {
		setID(id);
		setReservada(Reservada);
		setPrecio(Precio);
		setTipo(tipo);
		setCantidadMax(Cantidadmax);
		setVista(vista);
		setCocina(cocina);
		setBalcon(balcon);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Boolean getReservada() {
		return reservada;
	}

	public void setReservada(Boolean reservada) {
		this.reservada = reservada;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public int getCantidadMax() {
		return CantidadMax;
	}

	public void setCantidadMax(int cantidadMax) {
		CantidadMax = cantidadMax;
	}

	public Boolean getVista() {
		return Vista;
	}

	public void setVista(Boolean vista) {
		Vista = vista;
	}

	public Boolean getCocina() {
		return Cocina;
	}

	public void setCocina(Boolean cocina) {
		Cocina = cocina;
	}

	public Boolean getBalcon() {
		return Balcon;
	}

	public void setBalcon(Boolean balcon) {
		Balcon = balcon;
	}
	
	

}
