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
	private static Boolean reservar;
	
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
	
	private JLabel tamanotxt;
	private JLabel airetxt;
	private JLabel calefacciontxt;
	private JLabel tamanocamatxt;
	private JLabel tvtxt;
	private JLabel cafeteratxt;
	private JLabel ropaytapetestxt;
	private JLabel planchatxt;
	private JLabel secadortxt;
	private JLabel voltajeactxt;
	private JLabel tomasusbatxt;
	private JLabel tomasusbctxt;
	private JLabel desayunotxt;
	private JLabel hoteltxt;
	private JLabel parqueaderopagotxt;
	private JLabel parqueaderogratistxt;
	private JLabel piscinatxt;
	private JLabel zonashumedastxt;
	private JLabel bbqtxt;
	private JLabel wifigratistxt;
	private JLabel recepciontxt;
	private JLabel admitemascotastxt;
	private JLabel formato;
	
	public JLabel tamanovalue;
	public JLabel airevalue;
	public JLabel calefaccionvalue;
	public JLabel tamanocamavalue;
	public JLabel tvvalue;
	public JLabel cafeteravalue;
	public JLabel ropaytapetesvalue;
	public JLabel planchavalue;
	public JLabel secadorvalue;
	public JLabel voltajeacvalue;
	public JLabel tomasusbavalue;
	public JLabel tomasusbcvalue;
	public JLabel desayunovalue;
	public JLabel hotelvalue;
	public JLabel parqueaderopagovalue;
	public JLabel parqueaderogratisvalue;
	public JLabel piscinavalue;
	public JLabel zonashumedasvalue;
	public JLabel bbqvalue;
	public JLabel wifigratisvalue;
	public JLabel recepcionvalue;
	public JLabel admitemascotasvalue;
	
	private JTextField FechaInifield;
	private JTextField FechaFinfield;
	private JTextField Numfield;
	
	private JButton Reservar;
	private JButton Carga;
	private JButton Si;
	private JButton No;
	private JButton InformacionAdicional;
	
	public JComboBox<String> habitaciones;
	
	private JFrame informacion;
	
	
	
	public VentanaReserva(controller controller) {
		
		Controlador = controller;
		
		lleno = false;
		reservar = false;
		
		tamanotxt = new JLabel("Tamaño habitacion: ");
		tamanotxt.setSize(new Dimension(50,20));
		tamanotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		airetxt = new JLabel("Aire Acondicionado:");
		airetxt.setSize(new Dimension(50,20));
		airetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		calefacciontxt = new JLabel("Tiene caleffacion: ");
		calefacciontxt.setSize(new Dimension(50,20));
		calefacciontxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tamanocamatxt = new JLabel("Tamaño cama: ");
		tamanocamatxt.setSize(new Dimension(50,20));
		tamanocamatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tvtxt = new JLabel("Tiene tv: ");
		tvtxt.setSize(new Dimension(50,20));
		tvtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		formato = new JLabel("Formato: dd-M-yyyy");
		formato.setSize(new Dimension(50,20));
		formato.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cafeteratxt = new JLabel("Tiene cafetera: ");
		cafeteratxt.setSize(new Dimension(50,20));
		cafeteratxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		ropaytapetestxt = new JLabel("Ropa de cama: ");
		ropaytapetestxt.setSize(new Dimension(50,20));
		ropaytapetestxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		planchatxt = new JLabel("Tiene plancha: ");
		planchatxt.setSize(new Dimension(50,20));
		planchatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		secadortxt = new JLabel("Tiene secador: ");
		secadortxt.setSize(new Dimension(50,20));
		secadortxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		voltajeactxt = new JLabel("Voltaje AC: ");
		voltajeactxt.setSize(new Dimension(50,20));
		voltajeactxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tomasusbatxt = new JLabel("Toma USB-A:");
		tomasusbatxt.setSize(new Dimension(50,20));
		tomasusbatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tomasusbctxt = new JLabel("Toma USB-C:");
		tomasusbctxt.setSize(new Dimension(50,20));
		tomasusbctxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		desayunotxt = new JLabel("Incluye desayuno: ");
		desayunotxt.setSize(new Dimension(50,20));
		desayunotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		hoteltxt = new JLabel("HOTEL:");
		hoteltxt.setSize(new Dimension(50,20));
		hoteltxt.setFont(new Font("Arial", Font.BOLD, 15));
		
		parqueaderopagotxt = new JLabel("Parqueado pago: ");
		parqueaderopagotxt.setSize(new Dimension(50,20));
		parqueaderopagotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		parqueaderogratistxt = new JLabel("Parqueadero gratis: ");
		parqueaderogratistxt.setSize(new Dimension(50,20));
		parqueaderogratistxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		piscinatxt = new JLabel("Piscina:");
		piscinatxt.setSize(new Dimension(50,20));
		piscinatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		zonashumedastxt = new JLabel("Zonas Humedas: ");
		zonashumedastxt.setSize(new Dimension(50,20));
		zonashumedastxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		bbqtxt = new JLabel("Tiene BBQ: ");
		bbqtxt.setSize(new Dimension(50,20));
		bbqtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		wifigratistxt = new JLabel("Wifi Gratis: ");
		wifigratistxt.setSize(new Dimension(50,20));
		wifigratistxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		recepciontxt = new JLabel("Recepcion 24H: ");
		recepciontxt.setSize(new Dimension(50,20));
		recepciontxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		admitemascotastxt = new JLabel("Admite mascotas: ");
		admitemascotastxt.setSize(new Dimension(50,20));
		admitemascotastxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		
		tamanovalue = new JLabel("");
		tamanovalue.setHorizontalAlignment(SwingConstants.CENTER);
		tamanovalue.setSize(new Dimension(50,20));
		tamanovalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		airevalue = new JLabel("");
		airevalue.setHorizontalAlignment(SwingConstants.CENTER);
		airevalue.setSize(new Dimension(50,20));
		airevalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		calefaccionvalue = new JLabel("");
		calefaccionvalue.setHorizontalAlignment(SwingConstants.CENTER);
		calefaccionvalue.setSize(new Dimension(50,20));
		calefaccionvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tamanocamavalue = new JLabel("");
		tamanocamavalue.setHorizontalAlignment(SwingConstants.CENTER);
		tamanocamavalue.setSize(new Dimension(50,20));
		tamanocamavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tvvalue = new JLabel("");
		tvvalue.setHorizontalAlignment(SwingConstants.CENTER);
		tvvalue.setSize(new Dimension(50,20));
		tvvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cafeteravalue = new JLabel("");
		cafeteravalue.setHorizontalAlignment(SwingConstants.CENTER);
		cafeteravalue.setSize(new Dimension(50,20));
		cafeteravalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		ropaytapetesvalue = new JLabel("");
		ropaytapetesvalue.setHorizontalAlignment(SwingConstants.CENTER);
		ropaytapetesvalue.setSize(new Dimension(50,20));
		ropaytapetesvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		planchavalue = new JLabel("");
		planchavalue.setHorizontalAlignment(SwingConstants.CENTER);
		planchavalue.setSize(new Dimension(50,20));
		planchavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		secadorvalue = new JLabel("");
		secadorvalue.setHorizontalAlignment(SwingConstants.CENTER);
		secadorvalue.setSize(new Dimension(50,20));
		secadorvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		voltajeacvalue = new JLabel("");
		voltajeacvalue.setHorizontalAlignment(SwingConstants.CENTER);
		voltajeacvalue.setSize(new Dimension(50,20));
		voltajeacvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tomasusbavalue = new JLabel("");
		tomasusbavalue.setHorizontalAlignment(SwingConstants.CENTER);
		tomasusbavalue.setSize(new Dimension(50,20));
		tomasusbavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tomasusbcvalue = new JLabel("");
		tomasusbcvalue.setHorizontalAlignment(SwingConstants.CENTER);
		tomasusbcvalue.setSize(new Dimension(50,20));
		tomasusbcvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		desayunovalue = new JLabel("");
		desayunovalue.setHorizontalAlignment(SwingConstants.CENTER);
		desayunovalue.setSize(new Dimension(50,20));
		desayunovalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		hotelvalue = new JLabel("");
		hotelvalue.setHorizontalAlignment(SwingConstants.CENTER);
		hotelvalue.setSize(new Dimension(50,20));
		hotelvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		parqueaderopagovalue = new JLabel("No");
		parqueaderopagovalue.setHorizontalAlignment(SwingConstants.CENTER);
		parqueaderopagovalue.setSize(new Dimension(50,20));
		parqueaderopagovalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		parqueaderogratisvalue = new JLabel("Si");
		parqueaderogratisvalue.setHorizontalAlignment(SwingConstants.CENTER);
		parqueaderogratisvalue.setSize(new Dimension(50,20));
		parqueaderogratisvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		piscinavalue = new JLabel("Si");
		piscinavalue.setHorizontalAlignment(SwingConstants.CENTER);
		piscinavalue.setSize(new Dimension(50,20));
		piscinavalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		zonashumedasvalue = new JLabel("Si");
		zonashumedasvalue.setHorizontalAlignment(SwingConstants.CENTER);
		zonashumedasvalue.setSize(new Dimension(50,20));
		zonashumedasvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		bbqvalue = new JLabel("No");
		bbqvalue.setHorizontalAlignment(SwingConstants.CENTER);
		bbqvalue.setSize(new Dimension(50,20));
		bbqvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		wifigratisvalue = new JLabel("Si");
		wifigratisvalue.setHorizontalAlignment(SwingConstants.CENTER);
		wifigratisvalue.setSize(new Dimension(50,20));
		wifigratisvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		recepcionvalue = new JLabel("No");
		recepcionvalue.setHorizontalAlignment(SwingConstants.CENTER);
		recepcionvalue.setSize(new Dimension(50,20));
		recepcionvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
		admitemascotasvalue = new JLabel("Si");
		admitemascotasvalue.setHorizontalAlignment(SwingConstants.CENTER);
		admitemascotasvalue.setSize(new Dimension(50,20));
		admitemascotasvalue.setFont(new Font("Arial", Font.PLAIN, 15));
		
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
		
		InformacionAdicional = new JButton("Informacion Adicional");
		InformacionAdicional.setSize(new Dimension(30,20));
		InformacionAdicional.addActionListener(this);
		InformacionAdicional.setActionCommand("INFO");
		
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
		fechas.add(formato);
		
		JPanel Reserv = new JPanel();

		Reserv.setLayout(new FlowLayout());
		Reserv.add(habitaciones);
		Reserv.add(InformacionAdicional);
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
		
		informacion = new JFrame();
		informacion.setSize(new Dimension(300,600));
		informacion.setResizable(false);
		informacion.setTitle("Informacion adicional");
		informacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		informacion.setVisible(false);
		informacion.setLayout(new GridLayout(22,2));
		informacion.add(tamanotxt);
		informacion.add(tamanovalue);
		informacion.add(airetxt);
		informacion.add(airevalue);
		informacion.add(calefacciontxt);
		informacion.add(calefaccionvalue);
		informacion.add(tamanocamatxt);
		informacion.add(tamanocamavalue);
		informacion.add(tvtxt);
		informacion.add(tvvalue);
		informacion.add(cafeteratxt);
		informacion.add(cafeteravalue);
		informacion.add(ropaytapetestxt);
		informacion.add(ropaytapetesvalue);
		informacion.add(planchatxt);
		informacion.add(planchavalue);
		informacion.add(secadortxt);
		informacion.add(secadorvalue);
		informacion.add(voltajeactxt);
		informacion.add(voltajeacvalue);
		informacion.add(tomasusbatxt);
		informacion.add(tomasusbavalue);
		informacion.add(tomasusbctxt);
		informacion.add(tomasusbcvalue);
		informacion.add(desayunotxt);
		informacion.add(desayunovalue);
		informacion.add(hoteltxt);
		informacion.add(hotelvalue);
		informacion.add(parqueaderogratistxt);
		informacion.add(parqueaderogratisvalue);
		informacion.add(parqueaderopagotxt);
		informacion.add(parqueaderopagovalue);
		informacion.add(piscinatxt);
		informacion.add(piscinavalue);
		informacion.add(zonashumedastxt);
		informacion.add(zonashumedasvalue);
		informacion.add(bbqtxt);
		informacion.add(bbqvalue);
		informacion.add(wifigratistxt);
		informacion.add(wifigratisvalue);
		informacion.add(recepciontxt);
		informacion.add(recepcionvalue);
		informacion.add(admitemascotastxt);
		informacion.add(admitemascotasvalue);
		
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
		else if (grito.equals("INFO")) {
			if (reservar) {
				informacion.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this,"No puede ver informacion adicional sin haber buscado y seleccionado habitacion");
			}
		}
		else if(grito.equals("CARGAR")) {
			reservar = true;
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
			if (reservar) {
			String Habitacion = (String) habitaciones.getSelectedItem();
			String FechaIni = FechaInifield.getText();
			String FechaFin = FechaFinfield.getText();
			int num = Integer.parseInt(Numfield.getText());
			Controlador.crear_reserva(Habitacion, FechaIni, FechaFin,num);
			}
			else {
				JOptionPane.showMessageDialog(this,"No puede reservar sin haber buscado y seleccionado habitacion");
			}
		}	
}
}