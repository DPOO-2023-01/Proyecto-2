package Interfaze;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.controller;
import Logic.ReservaWriter;

public class VentanaHuespedes extends JFrame implements ActionListener{
	
	private static int num;
	
	private controller Controlador;
	private String File;
	
	private JLabel Cedulatxt;
	private JLabel telefonotxt;
	private JLabel Nombretxt;
	private JLabel emailtxt;
	private JLabel NumHuespedtxt;
	
	private JTextField Cedulafield;
	private JTextField telefonofield;
	private JTextField Nombrefield;
	private JTextField emailfield;
	
	private JButton Cargar;
	
	public VentanaHuespedes(controller controller, int NumHuesped,String file) {
		
		Controlador = controller;
		File = file;
		
		Cedulatxt = new JLabel("Cedula:");
		Cedulatxt.setPreferredSize(new Dimension(50,20));
		Cedulatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		telefonotxt = new JLabel("Telefono:");
		telefonotxt.setPreferredSize(new Dimension(50,20));
		telefonotxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		Nombretxt = new JLabel("Nombre:");
		Nombretxt.setPreferredSize(new Dimension(50,20));
		Nombretxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		emailtxt = new JLabel("Email:");
		emailtxt.setPreferredSize(new Dimension(50,20));
		emailtxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		NumHuespedtxt = new JLabel("Huesped #" + Integer.toString(NumHuesped));
		NumHuespedtxt.setPreferredSize(new Dimension(50,20));
		NumHuespedtxt.setFont(new Font("Arial", Font.BOLD, 15));
		NumHuespedtxt.setHorizontalAlignment(SwingConstants.CENTER);
		
		Cedulafield = new JTextField();
		Cedulafield.setPreferredSize(new Dimension(50,20));
		
		telefonofield = new JTextField();
		telefonofield.setPreferredSize(new Dimension(50,20));
		
		Nombrefield = new JTextField();
		Nombrefield.setPreferredSize(new Dimension(50,20));
		
		emailfield = new JTextField();
		emailfield.setPreferredSize(new Dimension(50,20));
		
		Cargar = new JButton("Cargar");
		Cargar.setPreferredSize(new Dimension(50,20));
		Cargar.addActionListener(this);
		Cargar.setActionCommand("CARGAR");
		
		setLayout(new GridLayout(5,2));
		setSize(new Dimension(400,150));
		setResizable(false);
		setTitle("Informacion Huesped");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(Nombretxt);
		add(Nombrefield);
		add(Cedulatxt);
		add(Cedulafield);
		add(telefonotxt);
		add(telefonofield);
		add(emailtxt);
		add(emailfield);
		add(Cargar);
		add(NumHuespedtxt);
		
}
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if(grito.equals("CARGAR")) {
			String Nombre = Nombrefield.getText();
			String Celular = telefonofield.getText();
			String Cedula = Cedulafield.getText();
			String Email = emailfield.getText();
			
			if (Nombre.equals("") || Celular.equals("")  || Cedula.equals("") || Email.equals("")) {
				JOptionPane.showMessageDialog(this,"Hay un campo vacio");
			}
			else {
				String Huesped = Nombre + "," + Celular + "," + Cedula + "," + Email;
				try {
					ReservaWriter.escribirHuespedes(File, Huesped);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(this,"Hubo un error escribiendo la informacion en el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
				}
				this.setVisible(false);
			}
			
		}
	}
}