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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class pantallaHabitaciones extends JPanel implements ActionListener{
	
	private ventanaprincipal papa;
	
	public pantallaHabitaciones(ventanaprincipal Padre, String Nombre) {	
		
		papa = Padre;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel TopPanel = new JPanel();
		TopPanel.setLayout(new FlowLayout());
		TopPanel.setBackground(Color.GRAY);
		JLabel usuariolbl = new JLabel("Usuario Actual:");
		JLabel nombrelbl = new JLabel(Nombre);
		JButton volverbtn = new JButton("Volver");
		volverbtn.addActionListener(this);
		volverbtn.setActionCommand("VOLVER");
		JButton salirbtn = new JButton("Salir");
		salirbtn.addActionListener(this);
		salirbtn.setActionCommand("SALIR");
		TopPanel.add(usuariolbl);
		TopPanel.add(nombrelbl);
		TopPanel.add(volverbtn,FlowLayout.RIGHT);
		TopPanel.add(salirbtn,FlowLayout.RIGHT);
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		add(TopPanel,c);
		
		JPanel TarifasPanel = new JPanel();
		TarifasPanel.setLayout(new GridLayout(7,2));
		JLabel Tarifaslbl = new JLabel("Tarifas Base:");
		JLabel space = new JLabel("*");
		JLabel sencillalbl = new JLabel("Sencilla:");
		JLabel suitelbl = new JLabel("Suite:");
		JLabel doblesuitelbl = new JLabel("Double Suite:");
		JLabel camaAdultolbl = new JLabel("Cama Adulto:");
		JLabel camaninolbl = new JLabel("Cama Niño:");
		JButton cambiarbtn1 = new JButton("Cambiar");
		cambiarbtn1.addActionListener(this);
		cambiarbtn1.setActionCommand("CAMBIARTARIFA");
		JTextField sencillatxt = new JTextField();
		JTextField suitetxt = new JTextField();
		JTextField dobletxt = new JTextField();
		JTextField camaadultotxt = new JTextField();
		JTextField camaninotxt = new JTextField();
		TarifasPanel.add(Tarifaslbl);
		TarifasPanel.add(space);
		TarifasPanel.add(sencillalbl);
		TarifasPanel.add(sencillatxt);
		TarifasPanel.add(suitelbl);
		TarifasPanel.add(suitetxt);
		TarifasPanel.add(doblesuitelbl);
		TarifasPanel.add(dobletxt);
		TarifasPanel.add(camaAdultolbl);
		TarifasPanel.add(camaadultotxt);
		TarifasPanel.add(camaninolbl);
		TarifasPanel.add(camaninotxt);
		TarifasPanel.add(cambiarbtn1);
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		add(TarifasPanel,c);
		
		JPanel AumentosPanel = new JPanel();
		AumentosPanel.setLayout(new GridLayout(5,2));
		JLabel Aumentoslbl = new JLabel("Aumento % por extras:");
		JLabel cocinalbl = new JLabel("Cocina:");
		JLabel vistalbl = new JLabel("Vista:");
		JLabel balconlbl = new JLabel("Balcon:");
		JLabel space2 = new JLabel("*");
		JTextField cocinatxt = new JTextField();
		JTextField vistatxt = new JTextField();
		JTextField Balcontxt = new JTextField();
		JButton cambiarbtn2 = new JButton("Cambiar");
		cambiarbtn2.addActionListener(this);
		cambiarbtn2.setActionCommand("CAMBIARAUMENTO");
		AumentosPanel.add(Aumentoslbl);
		AumentosPanel.add(space2);
		AumentosPanel.add(cocinalbl);
		AumentosPanel.add(cocinatxt);
		AumentosPanel.add(vistalbl);
		AumentosPanel.add(vistatxt);
		AumentosPanel.add(balconlbl);
		AumentosPanel.add(Balcontxt);
		AumentosPanel.add(cambiarbtn2);
		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.NONE;
		add(AumentosPanel,c);
		
		JPanel BotPanel = new JPanel();
		BotPanel.setLayout(new FlowLayout());
		JButton cambiarbtn3 = new JButton("Cambiar");
		cambiarbtn3.addActionListener(this);
		cambiarbtn3.setActionCommand("CAMBIARHABITACION");
		JLabel NombreNuevolbl = new JLabel("Nombre Nuevo:");
		JTextField NombreNuevotxt = new JTextField();
		JButton crear = new JButton("Crear");
		crear.addActionListener(this);
		crear.setActionCommand("CREAR");
		NombreNuevotxt.setPreferredSize(new Dimension(100,25));
		BotPanel.add(cambiarbtn3);
		BotPanel.add(NombreNuevolbl);
		BotPanel.add(NombreNuevotxt);
		BotPanel.add(crear);
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.BOTH;
		add(BotPanel,c);
		
		JPanel HabitacionPanel = new JPanel();
		HabitacionPanel.setLayout(new BorderLayout());
		JLabel IngreseHablbl = new JLabel("Ingrese el tipo de habitacion:");
		JLabel SeleccioneHablbl = new JLabel("Seleccione una Habitacion:");
		JComboBox ListaTipos = new JComboBox();
		ListaTipos.addItem("Estandart");
		ListaTipos.addItem("Suite");
		ListaTipos.addItem("DoubleSuite");
		ListaTipos.setPreferredSize(new Dimension(100,10));
		JRadioButton Libre = new JRadioButton("Libre");
		HabitacionPanel.add(Libre,BorderLayout.EAST);
		HabitacionPanel.add(ListaTipos,BorderLayout.WEST);
		HabitacionPanel.add(IngreseHablbl,BorderLayout.NORTH);
		HabitacionPanel.add(SeleccioneHablbl,BorderLayout.SOUTH);
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(HabitacionPanel,c);
		
		JPanel InformacionPanel = new JPanel();
		InformacionPanel.setLayout(new GridLayout(4,2));
		JComboBox ListaHabitaciones = new JComboBox();
		ListaHabitaciones.addActionListener(this);
		ListaHabitaciones.setActionCommand("HABITACIONSELECCIONADA");
		JLabel InformacionHablbl = new JLabel("Modificar Informacion de la Habitacion:");
		JLabel TIpolbl = new JLabel("Tipo:");
		JLabel space3 = new JLabel("*");
		JLabel space4 = new JLabel("*");
		JLabel Capacidadlbl = new JLabel("Capacidad Maxima:");
		JTextField Tipotxt = new JTextField();
		JTextField Capacidadtxt = new JTextField();
		InformacionPanel.add(ListaHabitaciones);
		InformacionPanel.add(space3);
		InformacionPanel.add(InformacionHablbl);
		InformacionPanel.add(space4);
		InformacionPanel.add(TIpolbl);
		InformacionPanel.add(Tipotxt);
		InformacionPanel.add(Capacidadlbl);
		InformacionPanel.add(Capacidadtxt);
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		add(InformacionPanel,c);
		
		JPanel AtributosHab = new JPanel();
		AtributosHab.setLayout(new GridLayout(5,3));
		JLabel ocupadalbl = new JLabel("Ocupada");
		JLabel cocinalbl2 = new JLabel("Cocina:");
		JLabel vistalbl2 = new JLabel("Vista:");
		JLabel balconlbl2 = new JLabel("Balcon:");
		JRadioButton Cocinasibtn = new JRadioButton("Si");
		JRadioButton Cocinanobtn = new JRadioButton("No");
		JRadioButton Vistasibtn = new JRadioButton("Si");
		JRadioButton Vistanobtn = new JRadioButton("No");
		JRadioButton Balconsibtn = new JRadioButton("Si");
		JRadioButton Balconnobtn = new JRadioButton("No");
		JRadioButton Ocupadasibtn = new JRadioButton("Si");
		JRadioButton Ocupadanobtn = new JRadioButton("No");
		JButton verreservasbtn = new JButton("Ver Rservas");
		AtributosHab.add(cocinalbl2);
		AtributosHab.add(Cocinasibtn);
		AtributosHab.add(Cocinanobtn);
		AtributosHab.add(vistalbl2);
		AtributosHab.add(Vistasibtn);
		AtributosHab.add(Vistanobtn);
		AtributosHab.add(balconlbl2);
		AtributosHab.add(Balconsibtn);
		AtributosHab.add(Balconnobtn);
		AtributosHab.add(ocupadalbl);
		AtributosHab.add(Ocupadasibtn);
		AtributosHab.add(Ocupadanobtn);
		AtributosHab.add(verreservasbtn);
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(AtributosHab,c);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if(grito.equals("VOLVER")) {
		}
		else if(grito.equals("SALIR")) {
		}
		
	}

}
