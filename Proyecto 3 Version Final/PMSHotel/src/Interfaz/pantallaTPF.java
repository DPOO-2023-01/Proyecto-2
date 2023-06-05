package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pantallaTPF extends JPanel{
	
	private ventanaprincipal papa;
	
	public pantallaTPF(ventanaprincipal Padre, String Nombre) {	
		papa = Padre;
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel TopPanel = new JPanel();
		TopPanel.setLayout(new FlowLayout());
		TopPanel.setBackground(Color.GRAY);
		JLabel usuariolbl = new JLabel("Usuario Actual:");
		JLabel nombrelbl = new JLabel(Nombre);
		JButton volverbtn = new JButton("Volver");
		volverbtn.setActionCommand("VOLVER");
		JButton salirbtn = new JButton("Salir");
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
		TarifasPanel.setLayout(new GridLayout(11,2));
		JLabel Tarifaslbl = new JLabel("Tarifa por periodo de tiempo:");
		JLabel space = new JLabel("");
		JLabel fechaInlbl = new JLabel("Fecha de Inicio:");
		JLabel fechaFinlbl = new JLabel("Fecha de Fin:");
		JLabel cambiolbl = new JLabel("Cambio de tarifa porcentual:");
		JLabel periodolbl = new JLabel("Nombre del periodo:");
		JLabel porDialbl = new JLabel("Tarifa por Día:");
		JLabel space2 = new JLabel("");
		JLabel space3 = new JLabel("");
		JLabel fIniciolbl = new JLabel("Fecha de inicio:");
		JLabel cTarifalbl = new JLabel("Cambio de tarifa porcentual");
		JLabel nPeriodolbl = new JLabel("Nombre del periodo");
		JButton crearbtn1 = new JButton("Crear");
		JButton crearbtn2 = new JButton("Crear");
		
		
		JTextField fechaIntxt = new JTextField();
		JTextField fechaFintxt = new JTextField();
		JTextField cambiotxt = new JTextField();
		JTextField periodotxt = new JTextField();
		JTextField fIniciotxt = new JTextField();
		JTextField cTarifatxt = new JTextField();
		JTextField nPeriodotxt = new JTextField();
		
		TarifasPanel.add(Tarifaslbl);
		TarifasPanel.add(space);
		TarifasPanel.add(fechaInlbl);
		TarifasPanel.add(fechaIntxt);
		TarifasPanel.add(fechaFinlbl);
		TarifasPanel.add(fechaFintxt);
		TarifasPanel.add(cambiolbl);
		TarifasPanel.add(cambiotxt);
		TarifasPanel.add(periodolbl);
		TarifasPanel.add(periodotxt);
		TarifasPanel.add(crearbtn1);
		TarifasPanel.add(space2);
		TarifasPanel.add(porDialbl);
		TarifasPanel.add(space3);
		TarifasPanel.add(fIniciolbl);
		TarifasPanel.add(fIniciotxt);
		TarifasPanel.add(cTarifalbl);
		TarifasPanel.add(cTarifatxt);
		TarifasPanel.add(nPeriodolbl);
		TarifasPanel.add(nPeriodotxt);
		TarifasPanel.add(crearbtn2);
		
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		add(TarifasPanel,c);
	}

}
