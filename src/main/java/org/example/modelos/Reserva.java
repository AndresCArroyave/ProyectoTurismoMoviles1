package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;



public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer cantidadPersonas;
    private ReservaValidacion validacion = new ReservaValidacion();
    private Util util = new Util();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer cantidadPersonas) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                ", cantidadPersonas=" + cantidadPersonas +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        try{
            this.costoTotal = costoTotal;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try{
            this.validacion.validarFormatoFecha(fechaReserva);
            this.fechaReserva = this.util.convertirStringEnLocaDate(fechaReserva);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        try{
            this.validacion.validarNumeroPersonas(cantidadPersonas);
            this.cantidadPersonas = cantidadPersonas;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}


