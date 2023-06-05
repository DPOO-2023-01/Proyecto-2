package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pantallaCheckout extends JPanel {
	private ventanaprincipal papa;
	public pantallaCheckout(ventanaprincipal Padre, String Nombre) {	
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
		JPanel checkout = new JPanel();
		checkout.setLayout(new GridLayout(2,2));
		
		JLabel nombre = new JLabel("Nombre del Huesped");
		JTextField name = new JTextField();
		JLabel cedula = new JLabel("Cédula:");
		JTextField cedulatxt = new JTextField();
		JButton boton = new JButton("Ir a pagar");
		
		checkout.add(nombre);
		checkout.add(name);
		checkout.add(cedula);
		checkout.add(cedulatxt);
		checkout.add(boton);
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		add(checkout,c);
		}
	}
