package Logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PSE {
	
	public static void crear_archivo_PSE(String nombre, String cedula, String estado) throws IOException{
		File file = new File("./Facturas/FacturaPSE" +";"+ nombre +";"+ cedula +";"+ estado + ".txt");
		file.createNewFile();
		
	}
	
	public static void escribir_factura_PSE(String file, String informacion) throws IOException {
		
		File archivo = new File(file);
		FileWriter fstream = new FileWriter(archivo,true);
		BufferedWriter info = new BufferedWriter(fstream);
		PrintWriter writer = new PrintWriter(info);
		writer.println(informacion);
		writer.flush();
		writer.close();

	}

}
