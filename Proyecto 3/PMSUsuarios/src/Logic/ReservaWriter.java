package Logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReservaWriter {
	
	public static void CreateReserva(String Habitacion, String FechaIni, String FechaFin) throws IOException{
		File file = new File("./Reservas/Reserva"+";"+ Habitacion + FechaIni + FechaFin + ".txt");
		file.createNewFile();
		
	}
	public static void escribirHuespedes(String file, String huesped) throws IOException {
		
		File archivo = new File(file);
		FileWriter fstream = new FileWriter(archivo,true);
		BufferedWriter info = new BufferedWriter(fstream);
		PrintWriter writer = new PrintWriter(info);
		writer.println(huesped);
		writer.flush();
		writer.close();

	}
}
