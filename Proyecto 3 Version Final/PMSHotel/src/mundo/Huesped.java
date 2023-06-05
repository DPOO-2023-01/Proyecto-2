package mundo;

public class Huesped {
	
	private String ID;
	private String Cedula;
	private String Email;
	private String Telefono;
	
	public Huesped(String id, String cedula, String email, String telefono) {
		
		this.setID(id);
		this.setCedula(cedula);
		this.setEmail(email);
		this.setTelefono(telefono);
		
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public Huesped(String id) {
		
		this.setID(id);
		this.setCedula(null);
		this.setEmail(null);
		this.setTelefono(null);
		
	}

}
