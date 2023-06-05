package Interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

import mundo.sesionPicker;

public class ventanaprincipal extends JFrame{
	
	private sesionPicker sesionPicker;
	private pantallaIReserva pantallaIReserva;
	private pantallaRecepcion pantallaRecepcion;
	private pantallaPrincipal pantallaPrincipal;
	private pantallaRestaurante pantallaRestaurante;
	private pantallaBReserva pantallaBReserva;
	private pantallaHabitaciones pantallaHabitaciones;
	private pantallaTPF pantallaTPF;
	private pantallaAdicionales pantallaAdicionales;
	private pantallaCheckout pantallaCheckout;
	
	public ventanaprincipal() {
		
		sesionPicker = new sesionPicker();
		
		pantallaIReserva = new pantallaIReserva(this, "Mitchell Gerard");
		pantallaRecepcion = new pantallaRecepcion(this,"Mitchell Gerard");
		pantallaPrincipal = new pantallaPrincipal(this);
		pantallaRestaurante = new pantallaRestaurante(this, "Amanda Smith");
		pantallaBReserva = new pantallaBReserva(this, "Mitchell Gerard");
		pantallaHabitaciones = new pantallaHabitaciones(this,"Mitchell Gerard");
		pantallaAdicionales = new pantallaAdicionales(this, "Amanda Smith");
		pantallaTPF = new pantallaTPF(this, "Amanda Smith");
		pantallaCheckout = new pantallaCheckout(this, "Amanda Smith");
		
		setLayout(new GridLayout(1,1));
		
		add(pantallaRestaurante);
		
		setSize(new Dimension(700,700));
		setResizable(true);
		setTitle("PMS Hotel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	public static void main(String[] args) {
		ventanaprincipal vc = new ventanaprincipal();
	}
	
	
	

}
