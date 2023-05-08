package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pantallaBReserva extends JPanel {
	
	private ventanaprincipal papa;
	
	public pantallaBReserva(ventanaprincipal Padre, String Nombre) {	
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
		c.fill = GridBagConstraints.BOTH;
		add(TopPanel,c);
		
		/*Buscar Reserva*/
		JPanel buscarReserva = new JPanel();
		buscarReserva.setLayout(new GridLayout(5,2));
		
		JLabel buscarlbl = new JLabel("Buscar Reserva");
		JLabel space = new JLabel("");
		JLabel namelbl = new JLabel("Nombre del Huesped:");
		JLabel cedulalbl = new JLabel("Cédula:");
		JTextField nametxt = new JTextField();
		JTextField cedulatxt = new JTextField();
		JButton buscarbtn1 = new JButton("Buscar");
		
		buscarReserva.add(buscarlbl);
		buscarReserva.add(space);
		buscarReserva.add(namelbl);
		buscarReserva.add(nametxt);
		buscarReserva.add(cedulalbl);
		buscarReserva.add(cedulatxt);
		buscarReserva.add(buscarbtn1);
	
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		add(buscarReserva,c);
		
		/*Información del Huesped */
		JPanel infoHuesped = new JPanel();
		infoHuesped.setLayout(new GridLayout(3,2));
		
		JLabel informacionlbl = new JLabel("Información del huesped principal:");
		JLabel space1 = new JLabel("");
		JLabel maillbl = new JLabel("Email:");
		JLabel telefonolbl = new JLabel("Telefono:");
		
		JTextField mailtxt = new JTextField();
		JTextField telefonotxt = new JTextField();
		
		infoHuesped.add(informacionlbl);
		infoHuesped.add(space1);
		infoHuesped.add(maillbl);
		infoHuesped.add(mailtxt);
		infoHuesped.add(telefonolbl);
		infoHuesped.add(telefonotxt);
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.NONE;
		add(infoHuesped,c);
		
		/*Información de las habitaciones*/
		JPanel infoH = new JPanel();
		infoH.setLayout(new GridLayout(3,2));
		
		JLabel infoHlbl = new JLabel("Información de las habitaciones: ");
		JLabel space2 = new JLabel("");
		JLabel numHlbl = new JLabel("Numero de Habitaciones:");
		JLabel Habitacionlbl = new JLabel("Habitación 1:");
		
		JTextField numHtxt = new JTextField();
		JTextField habitaciontxt = new JTextField();
		
		infoH.add(infoHlbl);
		infoH.add(space2);
		infoH.add(numHlbl);
		infoH.add(numHtxt);
		infoH.add(Habitacionlbl);
		infoH.add(habitaciontxt);
		
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.BOTH;
		add(infoH,c);
		
		/*Fechas*/
		JPanel fechasPanel= new JPanel();
		fechasPanel.setLayout(new GridLayout(4,2));
		
		JLabel fechaslbl = new JLabel("Fechas:");
		JLabel space3 = new JLabel("");
		JLabel fechaInlbl = new JLabel("Fecha de Inicio:");
		JLabel fechaFinlbl = new JLabel("Fecha final: ");
		JTextField fechaIntxt = new JTextField();
		JTextField fechaFintxt = new JTextField();
		JButton cancelarbtn = new JButton("Cancelar Reserva");
		
		fechasPanel.add(fechaslbl);
		fechasPanel.add(space3);
		fechasPanel.add(fechaInlbl);
		fechasPanel.add(fechaIntxt);
		fechasPanel.add(fechaFinlbl);
		fechasPanel.add(fechaFintxt);
		fechasPanel.add(cancelarbtn);
		
		c.gridx = 2;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		add(fechasPanel,c);
	}

}
