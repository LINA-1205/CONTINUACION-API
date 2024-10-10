package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoProducto")
public class Tipo_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTipo;
    private String nombreTipo;

    public Tipo_Producto() {
    }

    public Tipo_Producto(Long idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
