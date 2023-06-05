package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class pantallaIReserva extends JPanel {
	
	private ventanaprincipal papa;
	
	public pantallaIReserva(ventanaprincipal Padre, String Nombre) {	
		papa = Padre;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		/*Menu*/
		JPanel TopPanel = new JPanel();
		TopPanel.setLayout(new FlowLayout());
		TopPanel.setBackground(Color.GRAY);
		
		JLabel usuariolbl = new JLabel("Usuario Actual:");
		JLabel nombrelbl = new JLabel(Nombre);
		JButton volverbtn = new JButton("Volver");
		JButton salirbtn = new JButton("Salir");
		TopPanel.add(usuariolbl);
		TopPanel.add(nombrelbl);
		TopPanel.add(volverbtn,FlowLayout.RIGHT);
		TopPanel.add(salirbtn,FlowLayout.RIGHT);
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(TopPanel,c);
		
		/*BLOQUE 1*/
		JPanel infoHuesped = new JPanel();
		infoHuesped.setLayout(new GridLayout(10,2));
		
		JLabel infolbl = new JLabel("Información del huesped principal:");
		JLabel space = new JLabel("");
		JLabel namelbl = new JLabel("Nombre:");
		JLabel cedulalbl = new JLabel("Cédula:");
		JLabel maillbl = new JLabel("Email:");
		JLabel telefonolbl = new JLabel("Telefono:");
		JLabel numHuespedes = new JLabel("Numero de Huespedes:");
		JLabel space1 = new JLabel("");
		JLabel space2 = new JLabel("");
		JLabel space3 = new JLabel("");
		JLabel adultoslbl = new JLabel("Adultas adicionales: ");
		JLabel ninioslbl = new JLabel("Numero de huespedes niños: ");
		JLabel nombreHlbl = new JLabel("Nombre Huesped 1: ");
		
		JTextField nametxt = new JTextField();
		JTextField cedulatxt = new JTextField();
		JTextField mailtxt = new JTextField();
		JTextField telefonotxt = new JTextField();
		JTextField adultostxt = new JTextField();
		JTextField niniostxt = new JTextField();
		JTextField nombreHtxt = new JTextField();
		
		infoHuesped.add(infolbl);
		infoHuesped.add(space);
		infoHuesped.add(namelbl);
		infoHuesped.add(nametxt);
		infoHuesped.add(cedulalbl);
		infoHuesped.add(cedulatxt);
		infoHuesped.add(maillbl);
		infoHuesped.add(mailtxt);
		infoHuesped.add(telefonolbl);
		infoHuesped.add(telefonotxt);
		infoHuesped.add(space2);
		infoHuesped.add(space3);
		infoHuesped.add(numHuespedes);
		infoHuesped.add(space1);
		infoHuesped.add(adultoslbl);
		infoHuesped.add(adultostxt);
		infoHuesped.add(ninioslbl);
		infoHuesped.add(niniostxt);
		infoHuesped.add(nombreHlbl);
		infoHuesped.add(nombreHtxt);
		
	
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		add(infoHuesped,c);
		
		/*BLOQUE 2*/
		JPanel fechasPanel= new JPanel();
		fechasPanel.setLayout(new GridLayout(6,2));
		
		JLabel numHabitacioneslbl =new JLabel("Numero de Habitaciones: ");
		JLabel habitacionlbl = new JLabel("Habitación 1");
		JLabel fechaslbl = new JLabel("Fechas:");
		JLabel fechaInlbl = new JLabel("Fecha de Inicio:");
		JLabel fechaFinlbl = new JLabel("Fecha final: ");
		JLabel space4 = new JLabel("");
		JLabel space5 = new JLabel("");
		
		JTextField numHabitacionestxt = new JTextField();
		JTextField fechaIntxt = new JTextField();
		JTextField fechaFintxt = new JTextField();
		
		JComboBox ListaHabitaciones = new JComboBox();
		JButton cancelarbtn = new JButton("Cancelar Reserva");
		
		ListaHabitaciones.addItem("A101");
		ListaHabitaciones.addItem("A102");
		ListaHabitaciones.addItem("A103");
		ListaHabitaciones.setPreferredSize(new Dimension(100,10));
		
		fechasPanel.add(numHabitacioneslbl);
		fechasPanel.add(numHabitacionestxt);
		fechasPanel.add(habitacionlbl);
		fechasPanel.add(ListaHabitaciones);
		fechasPanel.add(fechaslbl);
		fechasPanel.add(space4);
		fechasPanel.add(fechaInlbl);
		fechasPanel.add(fechaIntxt);
		fechasPanel.add(fechaFinlbl);
		fechasPanel.add(fechaFintxt);
		fechasPanel.add(cancelarbtn);
		fechasPanel.add(space5);
		
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		add(fechasPanel,c);
		
		
		
	}

}
