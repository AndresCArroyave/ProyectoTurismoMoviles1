package org.example.modelos;

public class UsuarioPorEvento extends Usuario{

    private Double costoEvento;

    public UsuarioPorEvento() {
    }

    public UsuarioPorEvento(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoEvento = costoEvento;
    }

    public Double getCostoEvento() {
        return costoEvento;
    }

    public void setCostoEvento(Double costoEvento) {
        this.costoEvento = costoEvento;
    }

    public void calcularDescuento(){

    }
}
