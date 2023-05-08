package Interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pantallaPrincipal extends JPanel{
	
	private ventanaprincipal papa;
	private JLabel usernamelbl;
	private JLabel passwordlbl;
	private JTextField usernametxt;
	private JTextField passwordtxt;
	private JLabel bienvenidlbl;
	private JButton Exit;
	private JButton Login;
	
	public pantallaPrincipal(ventanaprincipal Padre) {	
		papa = Padre;
		setLayout(new GridLayout(4,2));
		usernamelbl = new JLabel("Username:");
		passwordlbl = new JLabel("Password:");
		bienvenidlbl = new JLabel("BIENVENIDO!!!!");
		usernametxt = new JTextField();
		passwordtxt = new JTextField();
		Exit = new JButton("Exit");
		Login = new JButton("Login");
		JLabel space = new JLabel(":)");
		
		add(bienvenidlbl);
		add(space);
		add(usernamelbl);
		add(usernametxt);
		add(passwordlbl);
		add(passwordtxt);
		add(Exit);
		add(Login);
		
		
		
		
		
	}

}
