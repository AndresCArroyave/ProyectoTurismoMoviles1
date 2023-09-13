package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioMembresiaValidacionTest {
    UsuarioMembresiaValidacion usuarioMembresiaValidacion;

    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("Estoy ejecutando la prueba");
        this.usuarioMembresiaValidacion = new UsuarioMembresiaValidacion();
    }

    @Test
    public void validarTopeFallaPorSobrepasado() {
        Double numeroPrueba = 3000000.0;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioMembresiaValidacion.validarTopePago(numeroPrueba));
        Assertions.assertEquals(Mensaje.TOPE_PAGO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarTopeFallaPorNegativo(){
        Double numeroPrueba = -90000.0;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioMembresiaValidacion.validarTopePago(numeroPrueba));
        Assertions.assertEquals(Mensaje.TOPE_PAGO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarTopeCorrecto(){
        Double numeroPrueba = 90000.0;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioMembresiaValidacion.validarTopePago(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
}