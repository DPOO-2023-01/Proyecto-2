package mundo;

public class Habitacion {
	
	private String ID;
	private String Tipo;
	private Boolean Vista;
	private Boolean Cocina;
	private Boolean Balcon;
	private Boolean Ocupacion;
	private int CapacidadMax;
	
	private static Double TarifaEst;
	private static Double TarifaSuite;
	private static Double TarifaDouble;
	
	private static Double AumentoVista;
	private static Double AumentoBalcon;
	private static Double AumentoCocina;
	
	public Habitacion(String id, String tipo, Boolean vista, Boolean cocina, Boolean balcon, Boolean ocupacion, int capacidadMax) {
		
		this.ID = id;
		this.Tipo = tipo;
		this.Vista = vista;
		this.Cocina = cocina;
		this.Balcon = balcon;
		this.Ocupacion = ocupacion;
		this.CapacidadMax = capacidadMax;
		
	}
	
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
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
	public Boolean getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(Boolean ocupacion) {
		Ocupacion = ocupacion;
	}
	public int getCapacidadMax() {
		return CapacidadMax;
	}
	public void setCapacidadMax(int capacidadMax) {
		CapacidadMax = capacidadMax;
	}
	public static Double getTarifaEst() {
		return TarifaEst;
	}
	public static void setTarifaEst(Double tarifaEst) {
		TarifaEst = tarifaEst;
	}
	public static Double getTarifaSuite() {
		return TarifaSuite;
	}
	public static void setTarifaSuite(Double tarifaSuite) {
		TarifaSuite = tarifaSuite;
	}
	public static Double getTarifaDouble() {
		return TarifaDouble;
	}
	public static void setTarifaDouble(Double tarifaDouble) {
		TarifaDouble = tarifaDouble;
	}
	public static Double getAumentoVista() {
		return AumentoVista;
	}
	public static void setAumentoVista(Double aumentoVista) {
		AumentoVista = aumentoVista;
	}
	public static Double getAumentoBalcon() {
		return AumentoBalcon;
	}
	public static void setAumentoBalcon(Double aumentoBalcon) {
		AumentoBalcon = aumentoBalcon;
	}
	public static Double getAumentoCocina() {
		return AumentoCocina;
	}
	public static void setAumentoCocina(Double aumentoCocina) {
		AumentoCocina = aumentoCocina;
	}
	
	
	
	

}
