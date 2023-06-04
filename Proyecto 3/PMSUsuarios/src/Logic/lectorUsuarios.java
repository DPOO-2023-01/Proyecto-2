package Logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class lectorUsuarios {
private ArrayList <user> Usuarios;
	
	public lectorUsuarios() {
		
		Usuarios = new ArrayList <user>();
		
		try {
			leer("./Data/users.txt");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<user> getUsuarios() {
		return this.Usuarios;
	}
	
	public void setUsuarios(ArrayList<user> lista) {
		this.Usuarios = lista;
	}
	
	private void leer(String nombre) throws IOException{
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String Username = datos[0];
			String Contrasena = datos[1];
			
			user nueva = new user(Username,Contrasena);
			Usuarios.add(nueva);
			
			linea = lector.readLine();
		}
		lector.close();
	}
	
	public void escribir(String usuario, String contra) throws IOException{
		
		File archivo = new File("./Data/users.txt");
		FileWriter fstream = new FileWriter(archivo,true);
		BufferedWriter info = new BufferedWriter(fstream);
		PrintWriter writer = new PrintWriter(info);
		
		writer.println(usuario+";"+contra);
		writer.flush();
		writer.close();
	}

}
