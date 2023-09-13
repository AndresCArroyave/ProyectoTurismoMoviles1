package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;



public class ReservaValidacion {
    private Util util = new Util();

    public Boolean validarFormatoFecha(String fecha)throws Exception{
        if (!util.buscarFormato(fecha, "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        return true;
    }
    public Boolean validarNumeroPersonas(Integer numeroPersonas)throws Exception{
        if (numeroPersonas < 0 || numeroPersonas > 4){
            throw new Exception(Mensaje.NUMERO_PERSONAS.getMensaje());
        }
        return true;
    }


}
