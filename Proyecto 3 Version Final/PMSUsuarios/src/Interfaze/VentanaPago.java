package Interfaze;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.controller;
import Logic.PSE;
import Logic.PayPal;
import Logic.ReservaWriter;
import Logic.Tarjeta;

public class VentanaPago extends JFrame implements ActionListener{
	
	private controller Controlador;
	
	private JLabel metodotxt;
	private JLabel totalapagartxt;
	private JLabel numtxt;
	
	private JLabel tipotarjetatxt;
	private JLabel numtarjetatxt;
	private JLabel cvvtxt;
	private JLabel vencimientotxt;
	private JLabel propietariotxt;
	private JLabel cedulatarjetatxt;
	
	private JLabel usuariopaypaltxt;
	private JLabel contrasenapaypaltxt;
	
	private JLabel nombrepsetxt;
	private JLabel bancopsetxt;
	private JLabel cedulapsetxt;
	private JLabel tipopersonapsetxt;
	private JLabel usuariopsetxt;
	private JLabel contrasenapsetxt;
	private JLabel numcuentapsetxt;

	private JTextField numtarjetafield;
	private JTextField cvvfield;
	private JTextField vencimientofield;
	private JTextField propietariofield;
	private JTextField cedulatarjetafield;
	
	private JTextField usuariopaypalfield;
	private JTextField contrasenapaypalfield;
	
	private JTextField nombrepsefield;
	private JTextField cedulapsefield;
	private JTextField usuariopsefield;
	private JTextField contrasenapsefield;
	private JTextField numcuentapsefield;
	
	private JButton pagar;
	private JButton cargar;
	
	private JComboBox<String> metodobox;
	private JComboBox<String> tipotarjetabox;
	private JComboBox<String> bancobox;
	private JComboBox<String> tipopersonabox;
	
	private JPanel Tarjetapanel;
	private JPanel PSEpanel;
	private JPanel PAYPAL;
	
	public VentanaPago(controller controller, String Total) {
		
		Controlador = controller;
		
		metodotxt = new JLabel("Que metodo desea usar?");
		metodotxt.setSize(new Dimension(50,20));
		metodotxt.setFont(new Font("Arial", Font.PLAIN, 15));

		tipotarjetatxt = new JLabel("Tipo de tarjeta:");
		tipotarjetatxt.setSize(new Dimension(50,20));
		tipotarjetatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		numtarjetatxt = new JLabel("Numero:");
		numtarjetatxt.setSize(new Dimension(50,20));
		numtarjetatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cvvtxt = new JLabel("CVV:");
		cvvtxt.setSize(new Dimension(50,20));
		cvvtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		vencimientotxt = new JLabel("Fecha de vencimiento:");
		vencimientotxt.setSize(new Dimension(50,20));
		vencimientotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		propietariotxt = new JLabel("Nombre Completo: ");
		propietariotxt.setSize(new Dimension(50,20));
		propietariotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cedulatarjetatxt = new JLabel("Cedula: ");
		cedulatarjetatxt.setSize(new Dimension(50,20));
		cedulatarjetatxt.setFont(new Font("Arial", Font.PLAIN, 15));

		usuariopaypaltxt = new JLabel("Usuario:");
		usuariopaypaltxt.setSize(new Dimension(50,20));
		usuariopaypaltxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		contrasenapaypaltxt = new JLabel("Contraseña:");
		contrasenapaypaltxt.setSize(new Dimension(50,20));
		contrasenapaypaltxt.setFont(new Font("Arial", Font.PLAIN, 15));

		nombrepsetxt = new JLabel("Nombre:");
		nombrepsetxt.setSize(new Dimension(50,20));
		nombrepsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		bancopsetxt = new JLabel("Banco:");
		bancopsetxt.setSize(new Dimension(50,20));
		bancopsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		cedulapsetxt = new JLabel("Cedula:");
		cedulapsetxt.setSize(new Dimension(50,20));
		cedulapsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		tipopersonapsetxt = new JLabel("Tipo:");
		tipopersonapsetxt.setSize(new Dimension(50,20));
		tipopersonapsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		usuariopsetxt = new JLabel("Usuario:");
		usuariopsetxt.setSize(new Dimension(50,20));
		usuariopsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		contrasenapsetxt = new JLabel("Contraseña:");
		contrasenapsetxt.setSize(new Dimension(50,20));
		contrasenapsetxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		numcuentapsetxt = new JLabel("Numero de Cuenta:");
		numcuentapsetxt.setSize(new Dimension(50,20));
		numcuentapsetxt.setFont(new Font("Arial", Font.PLAIN, 15));

		totalapagartxt = new JLabel("Total a pagar:");
		totalapagartxt.setSize(new Dimension(70,20));
		totalapagartxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		numtxt = new JLabel(Total);
		numtxt.setSize(new Dimension(30,20));
		numtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		numtarjetafield = new JTextField();
		numtarjetafield.setSize(new Dimension(50,20));
		
		cvvfield = new JTextField();
		cvvfield.setSize(new Dimension(50,20));
		
		vencimientofield = new JTextField();
		vencimientofield.setSize(new Dimension(50,20));
		
		propietariofield = new JTextField();
		propietariofield.setSize(new Dimension(50,20));
		
		cedulatarjetafield = new JTextField();
		cedulatarjetafield.setSize(new Dimension(50,20));
		
		usuariopaypalfield = new JTextField();
		usuariopaypalfield.setSize(new Dimension(50,20));
		
		contrasenapaypalfield = new JTextField();
		contrasenapaypalfield.setSize(new Dimension(50,20));
		
		nombrepsefield = new JTextField();
		nombrepsefield.setSize(new Dimension(50,20));
		
		cedulapsefield = new JTextField();
		cedulapsefield.setSize(new Dimension(50,20));
		
		usuariopsefield = new JTextField();
		usuariopsefield.setSize(new Dimension(50,20));
		
		contrasenapsefield = new JTextField();
		contrasenapsefield.setSize(new Dimension(50,20));
		
		numcuentapsefield = new JTextField();
		numcuentapsefield.setSize(new Dimension(50,20));
		
		pagar = new JButton("Pagar");
		pagar.setSize(new Dimension(50,20));
		pagar.addActionListener(this);
		pagar.setActionCommand("PAGAR");
		
		cargar = new JButton("Cargar");
		cargar.setSize(new Dimension(50,20));
		cargar.addActionListener(this);
		cargar.setActionCommand("CARGAR");
		
		metodobox = new JComboBox<String>();
		metodobox.addItem("Tarjeta");
		metodobox.addItem("PSE");
		metodobox.addItem("Paypal");
		metodobox.addActionListener(this);
		metodobox.setActionCommand("SELECCIONAR");
		
		tipotarjetabox = new JComboBox<String>();
		tipotarjetabox.addItem("American Express");
		tipotarjetabox.addItem("Mastercard");
		tipotarjetabox.addItem("Visa");
		
		tipopersonabox = new JComboBox<String>();
		tipopersonabox.addItem("Natural");
		tipopersonabox.addItem("Juridica");
		
		bancobox = new JComboBox<String>();
		bancobox.addItem("Bancolombia");
		bancobox.addItem("Davivienda");
		bancobox.addItem("Banco de Bogota");
		bancobox.addItem("Banco de Occidente");
		bancobox.addItem("BBVA");
		bancobox.addItem("AV Villas");
		
		JPanel Metodo = new JPanel();
		Metodo.setLayout(new FlowLayout());
		Metodo.add(metodotxt);
		Metodo.add(metodobox);
		Metodo.add(totalapagartxt);
		Metodo.add(numtxt);
		
		Tarjetapanel = new JPanel();
		Tarjetapanel.setLayout(new GridLayout(6,2));
		Tarjetapanel.add(propietariotxt);
		Tarjetapanel.add(propietariofield);
		Tarjetapanel.add(cedulatarjetatxt);
		Tarjetapanel.add(cedulatarjetafield);
		Tarjetapanel.add(tipotarjetatxt);
		Tarjetapanel.add(tipotarjetabox);
		Tarjetapanel.add(numtarjetatxt);
		Tarjetapanel.add(numtarjetafield);
		Tarjetapanel.add(cvvtxt);
		Tarjetapanel.add(cvvfield);
		Tarjetapanel.add(vencimientotxt);
		Tarjetapanel.add(vencimientofield);
		
		PAYPAL = new JPanel();
		PAYPAL.setLayout(new GridLayout(2,2));
		PAYPAL.add(usuariopaypaltxt);
		PAYPAL.add(usuariopaypalfield);
		PAYPAL.add(contrasenapaypaltxt);
		PAYPAL.add(contrasenapaypalfield);
		
		PSEpanel = new JPanel();
		PSEpanel.setLayout(new GridLayout(7,2));
		PSEpanel.add(nombrepsetxt);
		PSEpanel.add(nombrepsefield);
		PSEpanel.add(cedulapsetxt);
		PSEpanel.add(cedulapsefield);
		PSEpanel.add(tipopersonapsetxt);
		PSEpanel.add(tipopersonabox);
		PSEpanel.add(bancopsetxt);
		PSEpanel.add(bancobox);
		PSEpanel.add(usuariopsetxt);
		PSEpanel.add(usuariopsefield);
		PSEpanel.add(contrasenapsetxt);
		PSEpanel.add(contrasenapsefield);
		PSEpanel.add(numcuentapsetxt);
		PSEpanel.add(numcuentapsefield);
		
		setLayout(new BorderLayout());
		setSize(new Dimension(500,300));
		setResizable(false);
		setTitle("Pago Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		
		add(Metodo,BorderLayout.NORTH);
		add(pagar,BorderLayout.SOUTH);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if(grito.equals("SELECCIONAR")) {
			String metodo = (String) metodobox.getSelectedItem();
			System.out.println(metodo);
			remove(Tarjetapanel);
			remove(PSEpanel);
			remove(PAYPAL);
			if (metodo.equals("Tarjeta")) {
				add(Tarjetapanel,BorderLayout.CENTER);
				setSize(new Dimension(500,270));
				revalidate();
				repaint();
			}
			else if (metodo.equals("PSE")) {
				add(PSEpanel,BorderLayout.CENTER);
				setSize(new Dimension(500,300));
				revalidate();
				repaint();
			}
			else if (metodo.equals("Paypal")) {
				add(PAYPAL,BorderLayout.CENTER);
				setSize(new Dimension(500,150));
				revalidate();
				repaint();
			}
		}
		else if (grito.equals("PAGAR")) {
			String metodo = (String) metodobox.getSelectedItem();
			if (metodo.equals("Tarjeta")) {
				String propietario = propietariofield.getText();
				String cedula = cedulatarjetafield.getText();
				String tipo = (String) tipotarjetabox.getSelectedItem();
				String num = numtarjetafield.getText();
				String cvv = cvvfield.getText();
				String vencimiento = vencimientofield.getText();
				if (propietario.equals("")||cedula.equals("")||tipo.equals(null)||num.equals("")||cvv.equals("")||vencimiento.equals("") ) {
					JOptionPane.showMessageDialog(this,"No ha llenado todos los datos aun");
				}
				else {
					String informacion = propietario +";"+ cedula +";"+ tipo +";"+ num +";"+ cvv +";"+ vencimiento;
					try {
						Tarjeta.crear_archivo_tarjeta(propietario, cedula, "Exitoso");
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo crear la factura, intente cambiar nombre o cedula","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					try {
						Tarjeta.escribir_factura_tarjeta("./Facturas/FacturaTarjeta" +";"+ propietario +";"+ cedula +";"+ "Exitoso" + ".txt", informacion);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo escribir sobre la factura","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					JOptionPane.showMessageDialog(this,"Su pago se ha realizado exitosamente :)");
					this.setVisible(false);
				}
				}
			else if (metodo.equals("PSE")) {
				String nombre = nombrepsefield.getText();
				String cedula = cedulapsefield.getText();
				String tipopersona = (String)tipopersonabox.getSelectedItem();
				String banco = (String) bancobox.getSelectedItem();
				String usuario = usuariopsefield.getText();
				String contrasena = contrasenapsefield.getText();
				String cuenta = numcuentapsefield.getText();
				if (nombre.equals("")||cedula.equals("")||tipopersona.equals(null)||usuario.equals("")||contrasena.equals("")||cuenta.equals("")||banco.equals(null)) {
					JOptionPane.showMessageDialog(this,"No ha llenado todos los datos aun");
				}
				else {
					String informacion = nombre +";"+ cedula +";"+ tipopersona +";"+ banco +";"+ usuario +";"+ contrasena +";"+ cuenta;
					try {
						PSE.crear_archivo_PSE(nombre, cedula, "Exitoso");
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo crear la factura, intente cambiar nombre o cedula","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					try {
						PSE.escribir_factura_PSE("./Facturas/FacturaPSE" +";"+ nombre +";"+ cedula +";"+ "Exitoso" + ".txt", informacion);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo escribir sobre la factura","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					JOptionPane.showMessageDialog(this,"Su pago se ha realizado exitosamente con el 10% de descuento :)");
					this.setVisible(false); 
				}
				
				}
			else if (metodo.equals("Paypal")) {
				
				String usuario = usuariopaypalfield.getText();
				String contrasena = contrasenapaypalfield.getText();
				if (usuario.equals("")||contrasena.equals("")) {
					JOptionPane.showMessageDialog(this,"No ha llenado todos los datos aun");
				}
				else {
					String informacion = usuario +";"+ contrasena;
					try {
						PayPal.crear_archivo_paypal(usuario, "Exitoso");
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo crear la factura, intente cambiar nombre o cedula","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					try {
						PayPal.escribir_factura_paypal("./Facturas/FacturaPaypal" +";"+ usuario + ";"+ "Exitoso" + ".txt", informacion);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(this,"No se pudo escribir sobre la factura","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					JOptionPane.showMessageDialog(this,"Su pago se ha realizado exitosamente con el 10% de descuento :)");
					this.setVisible(false);
				}
			}
			
		}
	}
	
	

}