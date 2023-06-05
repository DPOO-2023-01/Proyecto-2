package pms.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Logic.LectorHabitaciones;
import Logic.habitacion;

import java.io.IOException;
import java.util.ArrayList;


public class LectorHabitacionesTest {

    private LectorHabitaciones lectorHabitaciones;

    @BeforeEach
    public void setUp() {
        lectorHabitaciones = new LectorHabitaciones();
    }

    @Test
    public void testLeerHabitaciones() {
        ArrayList<habitacion> habitaciones = lectorHabitaciones.getHabitaciones();
        Assertions.assertNotNull(habitaciones);
        Assertions.assertFalse(habitaciones.isEmpty());
    }
}

