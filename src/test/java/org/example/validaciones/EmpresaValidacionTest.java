package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaValidacionTest {

    EmpresaValidacion empresaValidacion;

    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");
        this.empresaValidacion = new EmpresaValidacion();
    }

    @Test
    public void validarNitFallaPorLongitud() {
        String numeroPrueba = "988712345";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.empresaValidacion.validarNit(numeroPrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NIT.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNitCorrecto() {
        String numeroPrueba = "9887123456";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.empresaValidacion.validarNit(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreEmpresaFallaPorLongitud() {
        String nombrePrueba = "Negocio para la salud y la vida de todos";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.empresaValidacion.validarNombreEmpresa(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_EMPRESA.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreEmpresaCorrecto() {
        String nombrePrueba = "Negocio para la salud";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.empresaValidacion.validarNombreEmpresa(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
}