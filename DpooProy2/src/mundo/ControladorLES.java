package mundo;

import java.util.ArrayList;

public class ControladorLES {
	
	private Biblioteca Biblioteca;
	
	public ControladorLES() {
		this.Biblioteca = new Biblioteca();
	}
	
	public Object getObjeto(String Lista,String ID) {
		Object retorno = null;
		if (Lista.equals("Huesped")) {
			ArrayList<Huesped> list = Biblioteca.getHuespedes();
			for (Huesped huesped : list) {
				if (huesped.getID().equals(ID)) {
					retorno = huesped;
				}
				else {retorno = new Huesped("Juan Roberto");}
			} 
		}
		else if (Lista.equals("Habitacion")) {
			ArrayList<Habitacion> list = Biblioteca.getHabitaciones();
			for (Habitacion habitacion : list) {
				if (habitacion.getID().equals(ID)) {
					retorno =  habitacion;
				}
				else {retorno =  new Huesped("Juan Roberto");}
			}
		}
		else if (Lista.equals("FechasTarifa")) {
			ArrayList<FechasTarifa> list = Biblioteca.getTarifas();
			for (FechasTarifa tarifa : list) {
				if (tarifa.getID().equals(ID)) {
					retorno = tarifa;
				}
				else {retorno = new Huesped("Juan Roberto");}
			}
		}
		else if (Lista.equals("Servicio")) {
			ArrayList<Servicio> list = Biblioteca.getServicios();
			for (Servicio servicio : list) {
				if (servicio.getID().equals(ID)) {
					retorno =  servicio;
				}
				else {retorno = new Huesped("Juan Roberto");}
			}
		}
		else if (Lista.equals("Reserva")) {
			ArrayList<Reserva> list = Biblioteca.getReservas();
			for (Reserva reserva : list) {
				if (reserva.getHuespedPrincipal().equals(ID)) {
					retorno = reserva;
				}
				else {retorno = new Huesped("Juan Roberto");}
			}
		}
		else if (Lista.equals("Usuario")) {
			ArrayList<Usuario> list = Biblioteca.getUsuarios();
			for (Usuario usuario : list) {
				if (usuario.getID().equals(ID)) {
					retorno = usuario;
				}
				else {retorno =  new Huesped("Juan Roberto");}
			}
		}
		else if (Lista.equals("FacturaServicio")) {
			ArrayList<FacturaServicio> list = Biblioteca.getHistorialServicios();
			for (FacturaServicio factura : list) {
				if (factura.getHuesped().equals(ID)) {
					retorno =  factura;
				}
				else {retorno =  new Huesped("Juan Roberto");}
			}
		}
		return retorno;
	}
	public void delObjeto(String Lista,String ID) {
		
		if (Lista.equals("Huesped")) {
			ArrayList<Huesped> list = Biblioteca.getHuespedes();
			for (Huesped huesped : list) {
				if (huesped.getID().equals(ID)) {
					list.remove(list.indexOf(huesped));
					Biblioteca.setHuespedes(list);
				}
			
		}
	}
		else if (Lista.equals("Habitacion")) {
			ArrayList<Habitacion> list = Biblioteca.getHabitaciones();
			for (Habitacion habitacion : list) {
				if (habitacion.getID().equals(ID)) {
					list.remove(list.indexOf(habitacion));
					Biblioteca.setHabitaciones(list);
			}
		}
}
		else if (Lista.equals("FechasTarifa")) {
			ArrayList<FechasTarifa> list = Biblioteca.getTarifas();
			for (FechasTarifa tarifa : list) {
				if (tarifa.getID().equals(ID)) {
					list.remove(list.indexOf(tarifa));
					Biblioteca.setTarifas(list);
			}
		}
}
		else if (Lista.equals("Servicio")) {
			ArrayList<Servicio> list = Biblioteca.getServicios();
			for (Servicio servicio : list) {
				if (servicio.getID().equals(ID)) {
					list.remove(list.indexOf(servicio));
					Biblioteca.setServicios(list);
				}
			}
		}
		else if (Lista.equals("Reserva")) {
			ArrayList<Reserva> list = Biblioteca.getReservas();
			for (Reserva reserva : list) {
				if (reserva.getHuespedPrincipal().equals(ID)) {
					list.remove(list.indexOf(reserva));
					Biblioteca.setReservas(list);
			}
		}
		}else if (Lista.equals("Usuario")) {
			ArrayList<Usuario> list = Biblioteca.getUsuarios();
			for (Usuario usuario : list) {
				if (usuario.getID().equals(ID)) {
					list.remove(list.indexOf(usuario));
					Biblioteca.setUsuarios(list);
	}
}
}		else if (Lista.equals("FacturaServicio")) {
			ArrayList<FacturaServicio> list = Biblioteca.getHistorialServicios();
			for (FacturaServicio factura : list) {
					if (factura.getHuesped().equals(ID)) {
						list.remove(list.indexOf(factura));
						Biblioteca.setHistorialServicios(list);
								}
				}
}
}
	public void addObjeto(String Lista, Object objeto) {
		if (Lista.equals("Huesped")) {
			ArrayList<Huesped> list = Biblioteca.getHuespedes();
			list.add((Huesped) objeto);
			Biblioteca.setHuespedes(list);
		}
		else if (Lista.equals("Habitacion")) {
			ArrayList<Habitacion> list = Biblioteca.getHabitaciones();
			list.add((Habitacion) objeto);
			Biblioteca.setHabitaciones(list);
		}
		else if (Lista.equals("FechasTarifa")) {
			ArrayList<FechasTarifa> list = Biblioteca.getTarifas();
			list.add((FechasTarifa) objeto);
			Biblioteca.setTarifas(list);
		}
		else if (Lista.equals("Servicio")) {
			ArrayList<Servicio> list = Biblioteca.getServicios();
			list.add((Servicio) objeto);
			Biblioteca.setServicios(list);
		}
		else if (Lista.equals("Reserva")) {
			ArrayList<Servicio> list = Biblioteca.getServicios();
			list.add((Servicio) objeto);
			Biblioteca.setServicios(list);
		}
		else if (Lista.equals("Usuario")) {
			ArrayList<Usuario> list = Biblioteca.getUsuarios();
			list.add((Usuario) objeto);
			Biblioteca.setUsuarios(list);
		}
		else if (Lista.equals("FacturaServicio")) {
			ArrayList<FacturaServicio> list = Biblioteca.getHistorialServicios();
			list.add((FacturaServicio) objeto);
			Biblioteca.setHistorialServicios(list);
		}
		
		
		
	}
	
}
		


