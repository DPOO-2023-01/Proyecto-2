package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Interfaze.VentanaHuespedes;
import Interfaze.VentanaPago;
import Interfaze.VentanaPrincipal;
import Interfaze.VentanaRegistro;
import Interfaze.VentanaReserva;
import Logic.LectorHabitaciones;
import Logic.ReservaWriter;
import Logic.habitacion;
import Logic.lectorUsuarios;
import Logic.user;

public class controller {
	
	private VentanaPrincipal Login;
	private ArrayList<user> users;
	private ArrayList<habitacion> habitaciones;
	private lectorUsuarios lectorUsuarios;
	private LectorHabitaciones lectorHabitaciones;
	private VentanaRegistro registro;
	private VentanaReserva reserva;
	private VentanaPago pago;
	
	
	
	public controller() {
		
		Login = new VentanaPrincipal(this);
		lectorUsuarios = new lectorUsuarios();
		lectorHabitaciones = new LectorHabitaciones();
		habitaciones = lectorHabitaciones.getHabitaciones();
		users = lectorUsuarios.getUsuarios();
		registro = new VentanaRegistro(this);
		reserva = new VentanaReserva(this);
	}
	
	public static void main(String[] args) {
		
		controller controlador = new controller();
	}
	
	public void Login(String Username, String Password) {
		if (Username.equals("")|| Password.equals("")) {
			JOptionPane.showMessageDialog(Login,"No ha llenado el usuario o contraseña","ERROR", JOptionPane.WARNING_MESSAGE);
		}
		else {
			Boolean found = false;
			for (int i = 0; i < users.size(); i++) { 		      
			user temp = (user) users.get(i);
			 if (temp.getUsuario().equals(Username) && temp.getContrasena().equals(Password)){
				 Login.setVisible(false);
				 reserva.setVisible(true);
				 found = true;
			 }
			} if (!found) {
				JOptionPane.showMessageDialog(Login,"Este usuario no existe","ERROR", JOptionPane.WARNING_MESSAGE);}}
	}
	
	public void Regist(String Username, String Password) {
		if (Username.equals("")|| Password.equals("")) {
			JOptionPane.showMessageDialog(Login,"No ha llenado el usuario o contraseña","ERROR", JOptionPane.WARNING_MESSAGE);
		}
		else {
			Boolean existe = false;
			for (int i = 0; i < users.size(); i++) { 		      
			user temp = (user) users.get(i);
			if (temp.getUsuario().equals(Username)) {
				JOptionPane.showMessageDialog(Login,"Este usuario ya existe");
				existe = true;
			}
		}
		if (!existe) {
			users.add(new user(Username,Password));
			try {
			this.lectorUsuarios.escribir(Username,Password);
			}
			catch (IOException io) {
			JOptionPane.showMessageDialog(registro,"Hubo un error guardando el usuario","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			reserva.setVisible(true);
			registro.setVisible(false);

		}
	}
}
	public void cargar_habitaciones(String FechaIni, String FechaFin, int Num) {
		if(FechaIni.equals("")||FechaFin.equals("")) {
			JOptionPane.showMessageDialog(reserva,"No ha llenado alguna fecha","ERROR", JOptionPane.WARNING_MESSAGE);
		}
		else {
		for (int i = 0; i < habitaciones.size(); i++) {
			if (!habitaciones.get(i).getReservada() && habitaciones.get(i).getCantidadMax() >= Num ) {
			reserva.habitaciones.addItem(habitaciones.get(i).getID());
			}
		}}
	}
	
	public void seleccionar_habitacion(String habitacion) {
		for (int i = 0; i < habitaciones.size(); i++) {
			habitacion hab = habitaciones.get(i);
			if (hab.getID().equals(habitacion)) {
				reserva.preciovalue.setText(String.valueOf(hab.getPrecio()));
				reserva.cantidadvalue.setText(String.valueOf(hab.getCantidadMax()));
				if (hab.getVista()) {
					reserva.vistavalue.setText("Si");
				}
				else {
					reserva.vistavalue.setText("No");
				}
				if (hab.getCocina()) {
					reserva.cocinavalue.setText("Si");
				}
				else {
					reserva.cocinavalue.setText("No");
				}
				if (hab.getBalcon()) {
					reserva.balconvalue.setText("Si");
				}
				else {
					reserva.balconvalue.setText("No");
				}
				reserva.tamanovalue.setText(hab.getTamano());
				if (hab.getAire()) {
					reserva.airevalue.setText("Si");
				}
				else {
					reserva.airevalue.setText("No");
				}
				if (hab.getCalefaccion()) {
					reserva.calefaccionvalue.setText("Si");
				}
				else {
					reserva.calefaccionvalue.setText("No");
				}
				reserva.tamanocamavalue.setText(hab.getTamanocama());
				if (hab.getTv()) {
					reserva.tvvalue.setText("Si");
				}
				else {
					reserva.tvvalue.setText("No");
				}
				if (hab.getCafetera()) {
					reserva.cafeteravalue.setText("Si");
				}
				else {
					reserva.cafeteravalue.setText("No");
				}
				if (hab.getRopa()) {
					reserva.ropaytapetesvalue.setText("Si");
				}
				else {
					reserva.ropaytapetesvalue.setText("No");
				}
				if (hab.getPlancha()) {
					reserva.planchavalue.setText("Si");
				}
				else {
					reserva.planchavalue.setText("No");
				}
				if (hab.getSecador()) {
					reserva.secadorvalue.setText("Si");
				}
				else {
					reserva.secadorvalue.setText("No");
				}
				if (hab.getVoltaje()) {
					reserva.voltajeacvalue.setText("Si");
				}
				else {
					reserva.voltajeacvalue.setText("No");
				}
				if (hab.getTomasa()) {
					reserva.tomasusbavalue.setText("Si");
				}
				else {
					reserva.tomasusbavalue.setText("No");
				}
				if (hab.getTomasc()) {
					reserva.tomasusbcvalue.setText("Si");
				}
				else {
					reserva.tomasusbcvalue.setText("No");
				}
				if (hab.getDesayuno()) {
					reserva.desayunovalue.setText("Si");
				}
				else {
					reserva.desayunovalue.setText("No");
				}
			}
		}
	}
	
	public void crear_reserva(String Habitacion, String FechaIni, String FechaFin,int num) {
		try {
			if(Habitacion.equals(null)|| FechaIni.equals("")||FechaFin.equals("")) {
				JOptionPane.showMessageDialog(reserva,"No ha llenado alguna fecha o no ha seleccionado habitacion","ERROR", JOptionPane.WARNING_MESSAGE);
			}
			else {
			ReservaWriter.CreateReserva(Habitacion, FechaIni, FechaFin);
			}
			ReservaWriter.escribirHuespedes("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt",Habitacion);
			ReservaWriter.escribirHuespedes("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt",FechaIni);
			ReservaWriter.escribirHuespedes("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt",FechaFin);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(reserva,"Hubo un error creando el archivo de la reserva, por favor intente con otra habitacion o fechas","ERROR", JOptionPane.ERROR_MESSAGE);
		}
		for (int i = 1; i < num+1; i++) {
			VentanaHuespedes temp = new VentanaHuespedes(this,i,"./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt");
		}
		reserva.setLleno(true);
	}
	
	public void write_payment(String File, String paid) {
		try {
			ReservaWriter.escribirHuespedes(File, paid);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(reserva,"No se ha podido escrbir en el archivo si se pago o no","ERROR", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void regist_login() {
		registro.setVisible(true);
		Login.setVisible(false);
	}
	public void pago_visible(String tarifa) {
		pago = new VentanaPago(this,tarifa);
		pago.setVisible(true);
	}
}