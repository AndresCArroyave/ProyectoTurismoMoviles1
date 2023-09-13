package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;


import java.time.LocalDate;




public class OfertaValidacion {

    private Util util = new Util();

    public Boolean validarTitulo(String titulo) throws Exception {
        if (titulo.length() > 20) {
            throw new Exception(Mensaje.LONGITUD_TITULO.getMensaje());
        }
        return true;
    }

    public  Boolean validarDiferenciaFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensaje.FECHA_INICIO_FIN.getMensaje());
        }
        return true;
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception {
        if (!util.buscarFormato(fecha, "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$")){
        throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
    }
        return true;
}

    public Boolean validarCosto(Double costo)throws Exception{
        if(costo <= 0) {
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        }
        return true;
    }


}
