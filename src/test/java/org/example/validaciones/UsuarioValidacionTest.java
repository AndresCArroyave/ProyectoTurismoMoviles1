package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioValidacionTest {

    //Preparo la prueba
    UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");
        this.usuarioValidacion=new UsuarioValidacion();
    }

    @Test
    public void validarNombreFallaPorNombreCorto() {
        //Prepare
        String nombrePrueba = "Juan";
        //Ejecute
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombre(nombrePrueba));
        //Verifique
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(),respuesta.getMessage());
    }

    @Test
    public  void validarNombreFallaPorCaracteres(){
        String nombrePrueba = "Juan@ 22";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba = "Camilo Arroyave Mejia";
        Boolean respuesta3 = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta3);
    }

    @Test
    public void validarUbicacionFallaPorError() {
        Integer numeroPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarUbicacion(numeroPrueba));
        Assertions.assertEquals(Mensaje.AVISO_ERROR.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta() {
        Integer numeroPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarUbicacion(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFallaPorFormato() {
        String correoPrueba ="juan.com";
        Exception respuesta = Assertions.assertThrows(Exception.class, () ->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_CORREO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCorreoCorrecto() {
        String correoPrueba= "andres1799@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }
}