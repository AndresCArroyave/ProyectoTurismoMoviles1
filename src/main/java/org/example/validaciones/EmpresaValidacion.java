package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class EmpresaValidacion {
    public Boolean validarNit(String nit)throws Exception{
        if(nit.length() != 10 ){
            throw new Exception(Mensaje.LONGITUD_NIT.getMensaje());
        }
        return true;
    }


    public Boolean validarNombreEmpresa(String nombre)throws Exception{
        if(nombre.length() > 30){
            throw new Exception((Mensaje.NOMBRE_EMPRESA.getMensaje()));
        }
        return true;
    }
}
