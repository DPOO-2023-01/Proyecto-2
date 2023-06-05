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

import mundo.ControladorLES;

public class pantallaRestaurante extends JPanel{
	
	private ventanaprincipal papa;
	private ControladorLES controladorLES;
	
	public pantallaRestaurante(ventanaprincipal Padre, String Nombre) {	
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
		JPanel registroPanel = new JPanel();
		registroPanel.setLayout(new GridLayout(7,2));
		
		JLabel registrolbl = new JLabel("Regitro de Servicios:");
		JLabel space = new JLabel("");
		JLabel namelbl = new JLabel("Ingrese el nombre del huesped:");
		JLabel numHlbl = new JLabel("Ingrese el numero de la habitación:");
		JLabel fechalbl = new JLabel("Ingrese la fecha:");
		JLabel facturadolbl = new JLabel("Facturado Ahora:");
		JLabel numServlbl = new JLabel("Ingrese el numero de servicios:");
		JLabel space2 = new JLabel("");
		
		JButton terminar = new JButton("Terminar");
		JRadioButton sibtn = new JRadioButton("Si");
		JRadioButton nobtn = new JRadioButton("No");
		
		JTextField nametxt = new JTextField();
		JTextField numHtxt = new JTextField();
		JTextField fechatxt = new JTextField();
		JTextField numServtxt = new JTextField();
		
		registroPanel.add(registrolbl);
		registroPanel.add(space);
		registroPanel.add(namelbl);
		registroPanel.add(nametxt);
		registroPanel.add(numHlbl);
		registroPanel.add(numHtxt);
		registroPanel.add(fechalbl);
		registroPanel.add(fechatxt);
		registroPanel.add(facturadolbl);
		registroPanel.add(space2);
		registroPanel.add(sibtn);
		registroPanel.add(nobtn);
		registroPanel.add(numServlbl);
		registroPanel.add(numServtxt);
		
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		add(registroPanel,c);
		
		/*Bloque 1*/
		JPanel servicios = new JPanel();
		servicios.setLayout(new GridLayout(1,3));
		
		JComboBox listaServ1 = new JComboBox(); 
		JComboBox listaServ2 = new JComboBox(); 
		JComboBox listaServ3 = new JComboBox(); 
		
		listaServ1.addItem("S101");
		listaServ1.addItem("S102");
		
		listaServ2.addItem("S101");
		listaServ2.addItem("S102");
		
		listaServ3.addItem("S101");
		listaServ3.addItem("S102");
		
		servicios.add(listaServ1);
		servicios.add(listaServ2);
		servicios.add(listaServ3);
		
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		add(servicios,c);
		
		/*Botón*/
		JPanel boton = new JPanel();
		boton.setLayout(new GridLayout(1,3));
		
		Object selectedObject = listaServ1.getSelectedItem();
		String selectedID = (String) selectedObject;
		JButton terminarbtn = new JButton("Terminar");
		terminarbtn.addActionListener(e -> {
		    if (controladorLES != null) {
		        controladorLES.agregarCant(selectedID);
		    }
		});
		JLabel space3 = new JLabel("");
		JLabel space4 = new JLabel("");
		
		boton.add(space3);
		boton.add(terminarbtn);
		boton.add(space4);
		
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.NONE;
		add(boton,c);
	}
	
	
	
	public void setControladorLES(ControladorLES controladorLES) {
	    this.controladorLES = controladorLES;
	}
	

}
