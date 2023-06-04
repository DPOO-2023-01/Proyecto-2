package Interfaze;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.controller;

public class MainMenu extends JPanel implements ActionListener{
	
	private controller Controlador;
	
	private JLabel Bienvenidatxt;
	private JLabel Usernametxt;
	private JLabel contrasenatxt;
	
	private JTextField Usernamefield;
	private JTextField contrasenafield;
	
	private JButton Login;
	private JButton Registrarse;
	
	public MainMenu(controller papa) {
		
		Controlador = papa;
		
		Bienvenidatxt = new JLabel("Bienvenido al sistema de usuarios del hotel!");
		Bienvenidatxt.setSize(new Dimension(70,25));
		Bienvenidatxt.setFont(new Font("Arial", Font.BOLD, 20));
		Bienvenidatxt.setHorizontalAlignment(SwingConstants.CENTER);
		Bienvenidatxt.setBackground(Color.DARK_GRAY);
		
		Usernametxt = new JLabel("Username: ");
		Usernametxt.setSize(new Dimension(50,25));
		Usernametxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		contrasenatxt = new JLabel("Contraseña: ");
		contrasenatxt.setSize(new Dimension(50,25));
		contrasenatxt.setFont(new Font("Arial", Font.PLAIN, 15));
		
		Usernamefield = new JTextField();
		Usernamefield.setSize(new Dimension(50,25));
		
		contrasenafield = new JTextField();
		contrasenafield.setSize(new Dimension(50,25));
		
		Login = new JButton("Login");
		Login.setSize(new Dimension(30,20));
		Login.addActionListener(this);
		Login.setActionCommand("LOGIN");
		
		Registrarse = new JButton("Registrarse");
		Registrarse.setSize(new Dimension(30,20));
		Registrarse.addActionListener(this);
		Registrarse.setActionCommand("REGISTRARSE");
		
		JPanel secund = new JPanel();
		secund.setLayout(new GridLayout(3,2));
		secund.add(Usernametxt);
		secund.add(Usernamefield);
		secund.add(contrasenatxt);
		secund.add(contrasenafield);
		secund.add(Registrarse);
		secund.add(Login);
		
		
		
		setLayout(new GridLayout(2,1));
		setSize(new Dimension(300,200));
		
		add(Bienvenidatxt);
		add(secund);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if(grito.equals("LOGIN")) {
			String username = Usernamefield.getText();
			String contra = contrasenafield.getText();
			Controlador.Login(username, contra);
		}
		else if(grito.equals("REGISTRARSE")) {
			Controlador.regist_login();
		}
		
	}

}
