package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class UsuarioPorEventoValidacion {

    public Boolean validarTopePago(Double pagoMensual)throws Exception {
        if (pagoMensual <= 0 || pagoMensual >= 200000) {
            throw new Exception(Mensaje.TOPE_PAGO.getMensaje());
        }
        return true;
    }
}
