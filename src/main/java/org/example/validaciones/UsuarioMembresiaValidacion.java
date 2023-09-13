package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class UsuarioMembresiaValidacion {

    public Boolean validarTopePago(Double pagoMensual)throws Exception {
        if (pagoMensual <= 0 || pagoMensual >= 100000) {
            throw new Exception(Mensaje.TOPE_PAGO.getMensaje());
        }
        return true;
    }
}
