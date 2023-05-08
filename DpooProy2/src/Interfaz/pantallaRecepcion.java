package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pantallaRecepcion extends JPanel{
	
	private ventanaprincipal papa;
	
	public pantallaRecepcion(ventanaprincipal Padre, String Nombre) {	
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
		
		/*Botones*/
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,2));
		
		JLabel seleccion = new JLabel("Seleccione una opción:");
		JLabel space = new JLabel("");
		JLabel space2 = new JLabel("");
		JLabel space3 = new JLabel("");
		JLabel space4 = new JLabel("");
		
		JButton ingresar = new JButton("Ingresar Reserva");
		JButton buscar = new JButton("Buscar Reserva");
		JButton buscarH = new JButton("Buscar Habitación");
		
		botones.add(seleccion);
		botones.add(space2);
		botones.add(ingresar);
		botones.add(space3);
		botones.add(buscar);
		botones.add(space4);
		botones.add(buscarH);
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		add(botones,c);
	}

}
