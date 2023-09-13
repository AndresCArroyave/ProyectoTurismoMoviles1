package org.example.modelos;

import org.example.validaciones.EmpresaValidacion;

public abstract class Empresa {
    private Integer id;
    private String nit;
    private  String nombre;
    private Integer ubicacion;
    private String descripcion;
    private EmpresaValidacion validacion = new EmpresaValidacion();

    public Empresa() {
    }

    public Empresa(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try{
            this.validacion.validarNit(nit);
            this.nit = nit;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacion.validarNombreEmpresa(nombre);
            this.nombre = nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract Double cobrar();
}
