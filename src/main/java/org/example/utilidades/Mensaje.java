package org.example.utilidades;

public enum Mensaje {

    LONGITUD_NOMBRE ("revise la longitud del nombre"),
    FORMATO_NOMBRE ("revise el formato del nombre ingresado"),
    AVISO_ERROR("error"),
    FORMATO_CORREO ("ingrese un correo valido"),
    LONGITUD_NIT ("revise la longitud del nit, deben de ser solo 10 caracteres"),
    NOMBRE_EMPRESA ("el nombre de la empresa no puede ser mayor a 30 caracteres"),
    LONGITUD_TITULO ("el titulo de la oferta no puede ser mayor a 20 caracteres"),
    FORMATO_FECHA ("Ingrese un formato de fecha valido"),
    FECHA_INICIO_FIN ("La fecha de fin no puede ser mayor a la fecha de inicio"),
    COSTO_PERSONA ("El valor no es permitido"),
    NUMERO_PERSONAS ("Ingrese un numero de personas valido"),
    TOPE_PAGO ("El tope de pago no puede ser negativo ni mayor a $100,000");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
