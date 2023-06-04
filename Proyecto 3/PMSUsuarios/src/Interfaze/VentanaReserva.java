package Interfaze;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import Controller.controller;

public class VentanaReserva extends JFrame implements ActionListener{
	
	private static Boolean lleno;
	
	private controller Controlador;
	
	private JLabel Info;
	private JLabel FechaInitxt;
	private JLabel FechaFintxt;
	private JLabel Numtxt;
	private JLabel Pagartxt;
	private JLabel preciotxt;
	public JLabel preciovalue;
	private JLabel cantidadtxt;
	public JLabel cantidadvalue;
	private JLabel vistatxt;
	public JLabel vistavalue;
	private JLabel cocinatxt;
	public JLabel cocinavalue;
	private JLabel balcontxt;
	public JLabel balconvalue;
	
	
	private JTextField FechaInifield;
	private JTextField FechaFinfield;
	private JTextField Numfield;
	
	private JButton Reservar;
	private JButton Carga;
	private JButton Si;
	private JButton No;
	
	public JComboBox<String> habitaciones;
	
	
	
	public VentanaReserva(controller controller) {
		
		Controlador = controller;
		
		lleno = false;
		
		Info = new JLabel("Ingrese informacion de su reserva");
		Info.setSize(new Dimension(80,25));
		Info.setFont(new Font("Arial", Font.BOLD, 25));
		Info.setHorizontalAlignment(SwingConstants.CENTER);
		
		FechaInitxt = new JLabel("Fecha Inicial:");
		FechaInitxt.setSize(new Dimension(50,20));
		FechaInitxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		FechaFintxt = new JLabel("Fecha final:");
		FechaFintxt.setSize(new Dimension(50,20));
		FechaFintxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		Numtxt = new JLabel("Numero de huespedes:");
		Numtxt.setSize(new Dimension(50,20));
		Numtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		Pagartxt = new JLabel("Desea pagar ahora?");
		Pagartxt.setSize(new Dimension(50,20));
		Pagartxt.setFont(new Font("Arial", Font.BOLD, 20));
		
		preciotxt = new JLabel("Precio$:");
		preciotxt.setSize(new Dimension(50,20));
		preciotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cantidadtxt = new JLabel("#Max de huespedes:");
		cantidadtxt.setSize(new Dimension(50,20));
		cantidadtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		vistatxt = new JLabel("Vista:");
		vistatxt.setSize(new Dimension(50,20));
		vistatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cocinatxt = new JLabel("Cocina:");
		cocinatxt.setSize(new Dimension(50,20));
		cocinatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		balcontxt = new JLabel("Balcon:");
		balcontxt.setSize(new Dimension(50,20));
		balcontxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		preciovalue = new JLabel("");
		preciovalue.setSize(new Dimension(50,20));
		preciovalue.setFont(new Font("Arial", Font.PLAIN, 15));
		preciovalue.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadvalue = new JLabel("");
		cantidadvalue.setSize(new Dimension(50,20));
		cantidadvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		cantidadvalue.setHorizontalAlignment(SwingConstants.CENTER);
		
		vistavalue = new JLabel("");
		vistavalue.setSize(new Dimension(50,20));
		vistavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		vistavalue.setHorizontalAlignment(SwingConstants.CENTER);
		
		cocinavalue = new JLabel("");
		cocinavalue.setSize(new Dimension(50,20));
		cocinavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		cocinavalue.setHorizontalAlignment(SwingConstants.CENTER);
		
		balconvalue = new JLabel("");
		balconvalue.setSize(new Dimension(50,20));
		balconvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		balconvalue.setHorizontalAlignment(SwingConstants.CENTER);
		
		FechaInifield = new JTextField();
		FechaInifield.setSize(new Dimension(50,30));
		
		FechaFinfield = new JTextField();
		FechaFinfield.setSize(new Dimension(50,30));
		
		Numfield = new JTextField();
		Numfield.setSize(new Dimension(50,30));
		
		Carga = new JButton("Cargar");
		Carga.setSize(new Dimension(50,20));
		Carga.addActionListener(this);
		Carga.setActionCommand("CARGAR");
		
		Si = new JButton("Si");
		Si.setSize(new Dimension(30,20));
		Si.addActionListener(this);
		Si.setActionCommand("SI");
		
		No = new JButton("No");
		No.setSize(new Dimension(30,20));
		No.addActionListener(this);
		No.setActionCommand("NO");
		
		Reservar = new JButton("Reservar");
		Reservar.setSize(new Dimension(50,20));
		Reservar.addActionListener(this);
		Reservar.setActionCommand("RESERVAR");
		
		habitaciones = new JComboBox<String>();
		habitaciones.setSize(new Dimension(50,20));
		habitaciones.addActionListener(this);
		habitaciones.setActionCommand("SELECCIONAR");
		
		JPanel fechas = new JPanel();
		
		fechas.setLayout(new GridLayout(2,4));
		fechas.add(Numtxt);
		fechas.add(FechaInitxt);
		fechas.add(FechaFintxt);
		fechas.add(Carga);
		fechas.add(Numfield);
		fechas.add(FechaInifield);
		fechas.add(FechaFinfield);
		
		JPanel Reserv = new JPanel();

		Reserv.setLayout(new FlowLayout());
		Reserv.add(habitaciones);
		Reserv.add(Reservar);
		
		JPanel juntos = new JPanel();
		
		juntos.setLayout(new GridLayout(2,1));
		juntos.add(fechas);
		juntos.add(Reserv);
		juntos.setSize(new Dimension(600,150));
		juntos.setBorder(new TitledBorder("Informacion de Reserva"));
		
		JPanel Pagos = new JPanel();
		
		Pagos.setLayout(new FlowLayout());
		Pagos.add(Pagartxt);
		Pagos.add(Si);
		Pagos.add(No);
		
		JPanel Infohab = new JPanel();
		Infohab.setLayout(new GridLayout(5,2));
		Infohab.add(preciotxt);
		Infohab.add(preciovalue);
		Infohab.add(cantidadtxt);
		Infohab.add(cantidadvalue);
		Infohab.add(vistatxt);
		Infohab.add(vistavalue);
		Infohab.add(cocinatxt);
		Infohab.add(cocinavalue);
		Infohab.add(balcontxt);
		Infohab.add(balconvalue);
		Infohab.setBorder(new TitledBorder("Informacion de habitacion"));
		
		setLayout(new BorderLayout());
		setSize(new Dimension(950,200));
		setResizable(false);
		setTitle("Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		
		add(Info,BorderLayout.NORTH);
		add(juntos,BorderLayout.CENTER);
		add(Pagos,BorderLayout.SOUTH);
		add(Infohab,BorderLayout.EAST);
		
	}



	public static Boolean getLleno() {
		return lleno;
	}



	public static void setLleno(Boolean lleno) {
		VentanaReserva.lleno = lleno;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String grito = e.getActionCommand();
		
		if(grito.equals("SI")) {
			if (lleno) {
			String Habitacion = (String) habitaciones.getSelectedItem();
			String FechaIni = FechaInifield.getText();
			String FechaFin = FechaFinfield.getText();
			Controlador.write_payment("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt", "SI_PAGO");
			JOptionPane.showMessageDialog(this,"Su reserva se ha creado con exito en la carpeta Reservas");
			String Tarifa = Double.toString(Double.parseDouble(preciovalue.getText())*2*0.90);
			Controlador.pago_visible(Tarifa);
			this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(this,"No ha llenado todos los datos de la reserva aun");
			}
		}
		else if(grito.equals("NO")) {
			if (lleno) {
			String Habitacion = (String) habitaciones.getSelectedItem();
			String FechaIni = FechaInifield.getText();
			String FechaFin = FechaFinfield.getText();
			Controlador.write_payment("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt", "NO_PAGO");
			JOptionPane.showMessageDialog(this,"Su reserva se ha creado con exito en la carpeta Reservas");
			this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(this,"No ha llenado todos los datos de la reserva aun");
			}
		}
		else if (grito.equals("SELECCIONAR")) {
			String habitacion = (String) habitaciones.getSelectedItem();
			Controlador.seleccionar_habitacion(habitacion);
			
		}
		else if(grito.equals("CARGAR")) {
			String FechaIni = FechaInifield.getText();
			String FechaFin = FechaFinfield.getText();
			String numero = Numfield.getText();
			int num = 0;
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		
			if (FechaIni.equals("")|| FechaFin.equals("")||numero.equals("")) {
				JOptionPane.showMessageDialog(this,"No ha llenado todos los datos aun");
			}
				else {
				
				try {
					Date FechaIniParsed = sdf.parse(FechaIni);
					Date FechaFinParsed = sdf.parse(FechaFin);
					try {
						num  = Integer.parseInt(numero);
						Controlador.cargar_habitaciones(FechaIni,FechaFin,num);
					} catch (NumberFormatException el) {
						JOptionPane.showMessageDialog(this,"Ingrese un numero entero en huespedes");
					}
				} catch (ParseException e1) {
					JOptionPane.showMessageDialog(this,"La fecha esta en formato incorrecto, ingrese en formato dd-M-yyyy");
				}
		}}
	
		else if(grito.equals("RESERVAR")) {
			String Habitacion = (String) habitaciones.getSelectedItem();
			String FechaIni = FechaInifield.getText();
			String FechaFin = FechaFinfield.getText();
			int num = Integer.parseInt(Numfield.getText());
			Controlador.crear_reserva(Habitacion, FechaIni, FechaFin,num);
		}	
}
}