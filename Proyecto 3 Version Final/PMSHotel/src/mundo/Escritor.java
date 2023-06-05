package mundo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class Escritor {
	public static void CreateServicio(String nombre, String FechaIni) throws IOException{
		File file = new File("./Servicios/Servicio"+";"+ nombre + FechaIni + ".txt");
		file.createNewFile();
		
	}
	public static void escribirServicio(String file, ArrayList Servicios) throws IOException {
		File archivo = new File(file);
		FileWriter fstream = new FileWriter(archivo,true);
		BufferedWriter info = new BufferedWriter(fstream);
		PrintWriter writer = new PrintWriter(info);
		
		for (int i = 0;i < Servicios.size(); i++) {
			Servicio temp = (Servicio) Servicios.get(i);
			String ID = temp.getID();
			String tipo = String.valueOf(temp.getTipo());
			String cantidad = String.valueOf(temp.getCantidad());
			String precio = String.valueOf(temp.getPrecio());
			String portatil = String.valueOf(temp.getPortatil());
			String ventas = String.valueOf(temp.getVentas());
			Date fecha = new Date();

			String Linea = ID +";"+tipo+";"+cantidad+";"+precio+";"+portatil+";"+ventas+";"+fecha;
			writer.println(Linea);
			
		}
		writer.flush();
		writer.close();

	}
}
