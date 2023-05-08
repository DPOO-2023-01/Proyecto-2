package mundo;

public class Usuario {
	
	private String ID;
	private String Tipo;
	private String Nombre;
	private String Contrasena;
	
	public Usuario(String id, String tipo, String nombre, String contrasena) {
		
		this.setID(id);
		this.setTipo(tipo);
		this.setNombre(nombre);
		this.setContrasena(contrasena);
		
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	} 
	

}
