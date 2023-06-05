package pms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Logic.user;

import java.io.IOException;
import java.util.ArrayList;

public class LectorUsuariosTest {

    private Logic.lectorUsuarios lectorUsuarios;

    @BeforeEach
    public void setUp() {
        lectorUsuarios = new Logic.lectorUsuarios();
    }

    @Test
    public void testLeerUsuarios() {
        ArrayList<user> usuarios = lectorUsuarios.getUsuarios();
        Assertions.assertNotNull(usuarios);
        Assertions.assertFalse(usuarios.isEmpty());
    }

    @Test
    public void testEscribirUsuario() {
        String usuario = "nuevoUsuario";
        String contrasena = "contrasena";
        try {
            lectorUsuarios.escribir(usuario, contrasena);
            ArrayList<user> usuarios = lectorUsuarios.getUsuarios();
            boolean usuarioEncontrado = false;
            for (user u : usuarios) {
                if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)) {
                    usuarioEncontrado = true;
                    break;
                }
            }
            Assertions.assertTrue(usuarioEncontrado);
        } catch (IOException e) {
            Assertions.fail("Error al escribir usuario: " + e.getMessage());
        }
    }
}
