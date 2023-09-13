package org.example.modelos;

public class EmpresaCultural extends Empresa {
    private String entidad;
    private String mision;

    /*private String emailContacto;
    private String numeroContacto;*/

    public EmpresaCultural() {
    }

    @Override
    public Double cobrar() {

        return null;
    }

    public EmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String entidad) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }


}
