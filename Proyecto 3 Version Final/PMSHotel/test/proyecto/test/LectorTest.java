package proyecto.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mundo.FacturaServicio;
import mundo.FechasTarifa;
import mundo.Habitacion;
import mundo.Huesped;
import mundo.Lector;
import mundo.Reserva;
import mundo.Servicio;
import mundo.Usuario;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LectorTest {

    @Test
    public void testLeerHuesped() throws IOException {
        Lector lector = new Lector();
        ArrayList<Huesped> huespedes = lector.leer("huespedes.txt", "Huesped");
        Assertions.assertEquals(2, huespedes.size());

        Huesped huesped1 = huespedes.get(0);
        Assertions.assertEquals("1", huesped1.getID());
        Assertions.assertEquals("123456789", huesped1.getCedula());
        Assertions.assertEquals("huesped1@example.com", huesped1.getEmail());
        Assertions.assertEquals("1234567890", huesped1.getTelefono());

        Huesped huesped2 = huespedes.get(1);
        Assertions.assertEquals("2", huesped2.getID());
        Assertions.assertEquals("987654321", huesped2.getCedula());
        Assertions.assertEquals("huesped2@example.com", huesped2.getEmail());
        Assertions.assertEquals("0987654321", huesped2.getTelefono());
    }

    @Test
    public void testLeerHabitacion() throws IOException {
        Lector lector = new Lector();
        ArrayList<Habitacion> habitaciones = lector.leer("habitaciones.txt", "Habitacion");
        Assertions.assertEquals(3, habitaciones.size());

        Habitacion habitacion1 = habitaciones.get(0);
        Assertions.assertEquals("1", habitacion1.getID());
        Assertions.assertEquals("Suite", habitacion1.getTipo());
        Assertions.assertTrue(habitacion1.getVista());
        Assertions.assertTrue(habitacion1.getCocina());
        Assertions.assertFalse(habitacion1.getBalcon());
        Assertions.assertTrue(habitacion1.getOcupacion());
        Assertions.assertEquals(2, habitacion1.getCapacidadMax());

        Habitacion habitacion2 = habitaciones.get(1);
        Assertions.assertEquals("2", habitacion2.getID());
        Assertions.assertEquals("Doble", habitacion2.getTipo());
        Assertions.assertFalse(habitacion2.getVista());
        Assertions.assertFalse(habitacion2.getCocina());
        Assertions.assertTrue(habitacion2.getBalcon());
        Assertions.assertFalse(habitacion2.getOcupacion());
        Assertions.assertEquals(2, habitacion2.getCapacidadMax());

        Habitacion habitacion3 = habitaciones.get(2);
        Assertions.assertEquals("3", habitacion3.getID());
        Assertions.assertEquals("Individual", habitacion3.getTipo());
        Assertions.assertFalse(habitacion3.getVista());
        Assertions.assertFalse(habitacion3.getCocina());
        Assertions.assertFalse(habitacion3.getBalcon());
        Assertions.assertFalse(habitacion3.getOcupacion());
        Assertions.assertEquals(1, habitacion3.getCapacidadMax());
    }

    @Test
    public void testLeerFechasTarifa() throws IOException, ParseException {
        Lector lector = new Lector();
        ArrayList<FechasTarifa> fechasTarifa = lector.leer("fechas_tarifa.txt", "FechasTarifa");
        Assertions.assertEquals(2, fechasTarifa.size());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

        FechasTarifa fechaTarifa1 = fechasTarifa.get(0);
        Assertions.assertEquals("1", fechaTarifa1.getID());
        Assertions.assertEquals(sdf.parse("01-01-2023"), fechaTarifa1.getFechaIni());
        Assertions.assertEquals(sdf.parse("31-01-2023"), fechaTarifa1.getFechaFin());
        Assertions.assertEquals(1.2, fechaTarifa1.getCambio());

        FechasTarifa fechaTarifa2 = fechasTarifa.get(1);
        Assertions.assertEquals("2", fechaTarifa2.getID());
        Assertions.assertEquals(sdf.parse("01-02-2023"), fechaTarifa2.getFechaIni());
        Assertions.assertEquals(sdf.parse("28-02-2023"), fechaTarifa2.getFechaFin());
        Assertions.assertEquals(1.5, fechaTarifa2.getCambio());
    }

    @Test
    public void testLeerServicio() throws IOException {
        Lector lector = new Lector();
        ArrayList<Servicio> servicios = lector.leer("servicios.txt", "Servicio");
        Assertions.assertEquals(3, servicios.size());

        Servicio servicio1 = servicios.get(0);
        Assertions.assertEquals("1", servicio1.getID());
        Assertions.assertTrue(servicio1.getTipo());
        Assertions.assertEquals(2, servicio1.getCantidad());
        Assertions.assertEquals(10.5, servicio1.getPrecio());
        Assertions.assertTrue(servicio1.getPortatil());

        Servicio servicio2 = servicios.get(1);
        Assertions.assertEquals("2", servicio2.getID());
        Assertions.assertFalse(servicio2.getTipo());
        Assertions.assertEquals(1, servicio2.getCantidad());
        Assertions.assertEquals(5.99, servicio2.getPrecio());
        Assertions.assertFalse(servicio2.getPortatil());

        Servicio servicio3 = servicios.get(2);
        Assertions.assertEquals("3", servicio3.getID());
        Assertions.assertTrue(servicio3.getTipo());
        Assertions.assertEquals(3, servicio3.getCantidad());
        Assertions.assertEquals(15.0, servicio3.getPrecio());
        Assertions.assertFalse(servicio3.getPortatil());
    }

    @Test
    public void testLeerReserva() throws IOException {
        Lector lector = new Lector();
        ArrayList<Reserva> reservas = lector.leer("reservas.txt", "Reserva");
        Assertions.assertEquals(2, reservas.size());

        Reserva reserva1 = reservas.get(0);
        Assertions.assertEquals("huesped1", reserva1.getHuespedesAdicionales().get(0));
        Assertions.assertEquals("huesped2", reserva1.getHuespedesAdicionales().get(1));
        Assertions.assertEquals(2, reserva1.getHabitaciones().size());
        Assertions.assertEquals("habitacion1", reserva1.getHabitaciones().get(0));
        Assertions.assertEquals("habitacion2", reserva1.getHabitaciones().get(1));
        Assertions.assertEquals(2, reserva1.getFechas().size());
        Assertions.assertEquals("fecha1", reserva1.getFechas().get(0));
        Assertions.assertEquals("fecha2", reserva1.getFechas().get(1));

        Reserva reserva2 = reservas.get(1);
        Assertions.assertEquals(1, reserva2.getHuespedesAdicionales().size());
        Assertions.assertEquals("huesped3", reserva2.getHuespedesAdicionales().get(0));
        Assertions.assertEquals(1, reserva2.getHabitaciones().size());
        Assertions.assertEquals("habitacion3", reserva2.getHabitaciones().get(0));
        Assertions.assertEquals(1, reserva2.getFechas().size());
        Assertions.assertEquals("fecha3", reserva2.getFechas().get(0));
    }

    @Test
    public void testLeerUsuario() throws IOException {
        Lector lector = new Lector();
        ArrayList<Usuario> usuarios = lector.leer("usuarios.txt", "Usuario");
        Assertions.assertEquals(2, usuarios.size());

        Usuario usuario1 = usuarios.get(0);
        Assertions.assertEquals("1", usuario1.getID());
        Assertions.assertEquals("Admin", usuario1.getTipo());
        Assertions.assertEquals("admin", usuario1.getNombre());
        Assertions.assertEquals("admin123", usuario1.getContrasena());

        Usuario usuario2 = usuarios.get(1);
        Assertions.assertEquals("2", usuario2.getID());
        Assertions.assertEquals("Empleado", usuario2.getTipo());
        Assertions.assertEquals("empleado", usuario2.getNombre());
        Assertions.assertEquals("empleado123", usuario2.getContrasena());
    }

    @Test
    public void testLeerFacturaServicio() throws IOException {
        Lector lector = new Lector();
        ArrayList<FacturaServicio> facturasServicio = lector.leer("facturas_servicio.txt", "FacturaServicio");
        Assertions.assertEquals(2, facturasServicio.size());

        FacturaServicio facturaServicio1 = facturasServicio.get(0);
        Assertions.assertEquals("huesped1", facturaServicio1.getHuesped());
        Assertions.assertEquals("habitacion1", facturaServicio1.getHabitacion());
        Assertions.assertEquals("fecha1", facturaServicio1.getFecha());
        Assertions.assertTrue(facturaServicio1.getFacturadoAhora());
        Assertions.assertEquals(2, facturaServicio1.getServicios().size());
        Assertions.assertEquals("servicio1", facturaServicio1.getServicios().get(0));
        Assertions.assertEquals("servicio2", facturaServicio1.getServicios().get(1));

        FacturaServicio facturaServicio2 = facturasServicio.get(1);
        Assertions.assertEquals("huesped2", facturaServicio2.getHuesped());
        Assertions.assertEquals("habitacion2", facturaServicio2.getHabitacion());
        Assertions.assertEquals("fecha2", facturaServicio2.getFecha());
        Assertions.assertFalse(facturaServicio2.getFacturadoAhora());
        Assertions.assertEquals(1, facturaServicio2.getServicios().size());
        Assertions.assertEquals("servicio3", facturaServicio2.getServicios().get(0));
    }
}

