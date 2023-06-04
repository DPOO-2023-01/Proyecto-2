package Interfaze;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

import Controller.controller;


public class VentanaPrincipal extends JFrame{
	
	private MainMenu MainMenu;
	private controller Controlador;

	public VentanaPrincipal(controller controller) {
		
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

