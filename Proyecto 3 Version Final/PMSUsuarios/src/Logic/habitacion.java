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
	private String tamano;
	private Boolean aire;
	private Boolean calefaccion;
	private String tamanocama;
	private Boolean tv;
	private Boolean cafetera;
	private Boolean ropa;
	private Boolean plancha;
	private Boolean secador;
	private Boolean voltaje;
	private Boolean tomasa;
	private Boolean tomasc;
	private Boolean desayuno;
	
	public habitacion(String id, Boolean Reservada, double Precio, String tipo, int Cantidadmax, Boolean vista, Boolean cocina, Boolean balcon, String Tamano, Boolean Aire, Boolean Calefaccion, String Tamanocama, Boolean Tv, Boolean Cafetera, Boolean Ropa, Boolean Plancha, Boolean Secador, Boolean Voltaje, Boolean Tomasa, Boolean Tomasc, Boolean Desayuno) {
		
		setID(id);
		setReservada(Reservada);
		setPrecio(Precio);
		setTipo(tipo);
		setCantidadMax(Cantidadmax);
		setVista(vista);
		setCocina(cocina);
		setBalcon(balcon);
		setTamano(Tamano);
		setAire(Aire);
		setCalefaccion(Calefaccion);
		setTamanocama(Tamanocama);
		setTv(Tv);
		setCafetera(Cafetera);
		setRopa(Ropa);
		setPlancha(Plancha);
		setSecador(Secador);
		setVoltaje(Voltaje);
		setTomasa(Tomasa);
		setTomasc(Tomasc);
		setDesayuno(Desayuno);
		
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

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Boolean getAire() {
		return aire;
	}

	public void setAire(Boolean aire) {
		this.aire = aire;
	}

	public Boolean getCalefaccion() {
		return calefaccion;
	}

	public void setCalefaccion(Boolean calefaccion) {
		this.calefaccion = calefaccion;
	}

	public String getTamanocama() {
		return tamanocama;
	}

	public void setTamanocama(String tamanocama) {
		this.tamanocama = tamanocama;
	}

	public Boolean getTv() {
		return tv;
	}

	public void setTv(Boolean tv) {
		this.tv = tv;
	}

	public Boolean getCafetera() {
		return cafetera;
	}

	public void setCafetera(Boolean cafetera) {
		this.cafetera = cafetera;
	}

	public Boolean getRopa() {
		return ropa;
	}

	public void setRopa(Boolean ropa) {
		this.ropa = ropa;
	}

	public Boolean getPlancha() {
		return plancha;
	}

	public void setPlancha(Boolean plancha) {
		this.plancha = plancha;
	}

	public Boolean getSecador() {
		return secador;
	}

	public void setSecador(Boolean secador) {
		this.secador = secador;
	}

	public Boolean getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(Boolean voltaje) {
		this.voltaje = voltaje;
	}

	public Boolean getTomasa() {
		return tomasa;
	}

	public void setTomasa(Boolean tomasa) {
		this.tomasa = tomasa;
	}

	public Boolean getTomasc() {
		return tomasc;
	}

	public void setTomasc(Boolean tomasc) {
		this.tomasc = tomasc;
	}

	public Boolean getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(Boolean desayuno) {
		this.desayuno = desayuno;
	}
	
	

}