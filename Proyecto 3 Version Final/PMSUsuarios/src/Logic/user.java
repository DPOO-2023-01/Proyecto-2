package Logic;


public class user {
	
	private String Usuario;
	private String Contrasena;
	
	public user(String Username, String Contra) {
		setUsuario(Username);
		setContrasena(Contra);
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
}
