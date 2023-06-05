package Interfaze;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.controller;


public class VentanaPrincipal extends JFrame{
	
	private MainMenu MainMenu;
	private controller Controlador;

	public VentanaPrincipal(controller controller) {
		
		JOptionPane.showMessageDialog(this,"Asegurese de tener las carpetas Reservas y Facturas al lado de Data para el correcto funcionamiento");
		Controlador = controller;
		
		MainMenu = new MainMenu(Controlador);
		
		setLayout(new BorderLayout());
		setSize(new Dimension(450,170));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(MainMenu, BorderLayout.CENTER);
		
		

	}
}

