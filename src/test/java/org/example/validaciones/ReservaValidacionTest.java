package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    ReservaValidacion reservaValidacion;

    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");
        this.reservaValidacion=new ReservaValidacion();
    }

    @Test
    public void validarFechaFallaPorFormato() {
        String fechaPrueba = "08-15-2023";         //"MM-dd-yyyy Mala
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.reservaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFechaCorrecta() {
        String fechaPrueba = "29-08-2023";              //dd-MM-yyyy
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasFallaPorCantidad() {
        Integer numeroPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.reservaValidacion.validarNumeroPersonas(numeroPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNumeroPersonasCantidadCorrecta() {
        Integer numeroPrueba = 3;
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.reservaValidacion.validarNumeroPersonas(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarIvaFallaPorDatosIncorrectos() {
    }

    @Test
    public void validarIvaCorrecto() {
    }
}