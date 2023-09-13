package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void configurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");
        this.ofertaValidacion = new OfertaValidacion();
    }

    @Test
    public void validarTituloFallaPorLongitud() {
        String tituloPrueba = "Obra de teatro de la mujer como ama de casa";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_TITULO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarTituloCorrecto() {
        String tituloPrueba = "Concierto en familia";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechasFallanPorDiferencia() {
        LocalDate fechaPruebaInicio = LocalDate.of(2023,9,30);
        LocalDate fechaPruebaFin = LocalDate.of(2023,9,15);
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarDiferenciaFechas(fechaPruebaInicio,fechaPruebaFin));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_FIN.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarDiferenciaFechasCorrecta() {
        LocalDate fechaPruebaInicio = LocalDate.of(2023,9,15);
        LocalDate fechaPruebaFin = LocalDate.of(2023,9,30);
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarDiferenciaFechas(fechaPruebaInicio,fechaPruebaFin));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechaFallaPorFormato() {
        String fechaPrueba = "08-15-2023";         //"MM-dd-yyyy Mala
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFormatoFechaCorrecta() {
        String fechaPrueba = "29-08-2023";              //dd-MM-yyyy
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFormatoFecha(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCostoFallaPorValorIncorrecto() {
        Double costoPrueba = -40.00;
        Exception  respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarCosto(costoPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCostoCorrecto() {
        Double costoPrueba = 40.00;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarCosto(costoPrueba));
        Assertions.assertTrue(respuesta);

    }
}