package Interfaze;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.controller;

public class VentanaRegistro extends JFrame implements ActionListener{
	
	private controller Controlador;
	
	private JLabel Info;
	private JLabel usernametxt;
	private JLabel contrasenatxt;
	
	private JTextField usernamefield;
	private JTextField contrasenafield;
	
	private JButton registrarse;
	
	

	public VentanaRegistro(controller controller) {
		
		Controlador = controller;
		
		Info = new JLabel("Ingrese su nuevo usuario y contraseña");
		Info.setSize(new Dimension(80,20));
		Info.setFont(new Font("Arial", Font.BOLD, 20));
		Info.setHorizontalAlignment(SwingConstants.CENTER);
		
		usernametxt = new JLabel("Username: ");
		usernametxt.setSize(new Dimension(50,20));
		usernametxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		contrasenatxt = new JLabel("Contraseña: ");
		contrasenatxt.setSize(new Dimension(50,20));
		contrasenatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		usernamefield = new JTextField();
		usernamefield.setSize(new Dimension(50,20));
		
		contrasenafield = new JTextField();
		contrasenafield.setSize(new Dimension(50,20));
		
		registrarse = new JButton("Registrarse");
		registrarse.setSize(new Dimension(30,20));
		registrarse.addActionListener(this);
		registrarse.setActionCommand("REGIST");

		JPanel secund = new JPanel();
		
		secund.setLayout(new GridLayout(3,2));
		secund.add(usernametxt);
		secund.add(usernamefield);
		secund.add(contrasenatxt);
		secund.add(contrasenafield);
		secund.add(registrarse);

		setLayout(new GridLayout(2,1));
		setSize(new Dimension(400,150));
		setResizable(false);
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		
		add(Info);
		add(secund);

	}
	
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if(grito.equals("REGIST")) {
			String username = usernamefield.getText();
			String password = contrasenafield.getText();
			Controlador.Regist(username, password);

		}}
}
