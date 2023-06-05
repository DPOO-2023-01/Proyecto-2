package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class pantallaAdicionales extends JPanel{
	
	private ventanaprincipal papa;
	
	public pantallaAdicionales(ventanaprincipal Padre, String Nombre) {	
		papa = Padre;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
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
		
		/*Bloque 1*/
		JPanel TipoServPanel = new JPanel();
		TipoServPanel.setLayout(new GridLayout(2,2));
		
		JLabel TipoServlbl = new JLabel("Tipo de Servicio:");
		JLabel space = new JLabel("");
		
		
		JRadioButton spabtn = new JRadioButton("Spa");
		JRadioButton restaurantebtn = new JRadioButton("Restaurante");
		
		TipoServPanel.add(TipoServlbl);
		TipoServPanel.add(space);
		TipoServPanel.add(spabtn);
		TipoServPanel.add(restaurantebtn);
		
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		add(TipoServPanel,c);
		
		/*Bloque 2*/
		JPanel bloque2 = new JPanel();
		bloque2.setLayout(new GridLayout(8,2));
		
		JLabel listaServlbl = new JLabel("Lista de Servicios:");
		JLabel nuevoServlbl = new JLabel("Nuevo Servicio:");
		JLabel cantidadlbl = new JLabel("Cantidad:");
		JLabel preciolbl = new JLabel("Precio:");
		JLabel nuevolbl = new JLabel("Nombre Nuevo:");
		JLabel space2 = new JLabel("");
		JLabel space3 = new JLabel("");
		
		JButton cambiarbtn = new JButton("Cambiar");
		JButton crearbtn = new JButton("Crear");
		JComboBox listaServ = new JComboBox();
		
		JTextField cantidadtxt = new JTextField();
		JTextField preciotxt = new JTextField();
		JTextField nombretxt = new JTextField();
		
		listaServ.addItem("S101");
		listaServ.addItem("S02");
		listaServ.addItem("S103");
		
		bloque2.add(listaServlbl);
		bloque2.add(space2);
		bloque2.add(cantidadlbl);
		bloque2.add(cantidadtxt);
		bloque2.add(preciolbl);
		bloque2.add(preciotxt);
		bloque2.add(cambiarbtn);
		bloque2.add(space3);
		bloque2.add(nuevolbl);
		bloque2.add(nombretxt);
		bloque2.add(crearbtn);
		
		
		
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		add(bloque2,c);
	}
}
