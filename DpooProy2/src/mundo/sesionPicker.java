package mundo;

public class sesionPicker {
	
	private sesion Sesion;
	private ControladorLES ControladorLES;
	
	public sesionPicker() {
		
		this.setControladorLES(new ControladorLES());
		this.setSesion(null);
		
		
	}
	
	public void checkUsuario(String ID, String Contrasena) {
		Usuario usuario = (Usuario) ControladorLES.getObjeto("Usuario",ID);
		if (usuario.getContrasena().equals(Contrasena)) {
			if (usuario.getTipo().equals("Administrador"));
			this.Sesion = new sesionAdmin();
		} else if (usuario.getTipo().equals("Recepcionista")) {
			this.Sesion = new sesionRecepcion();
		} else if (usuario.getTipo().equals("Servidor")) {
			this.Sesion = new sesionServidor();
		}
		
		
	}

	public sesion getSesion() {
		return Sesion;
	}

	public void setSesion(sesion sesion) {
		Sesion = sesion;
	}

	public ControladorLES getControladorLES() {
		return ControladorLES;
	}

	public void setControladorLES(ControladorLES controladorLES) {
		ControladorLES = controladorLES;
	}

}
