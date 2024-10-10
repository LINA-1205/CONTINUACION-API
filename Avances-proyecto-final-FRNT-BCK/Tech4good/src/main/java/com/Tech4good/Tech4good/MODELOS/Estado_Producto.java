package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "estadoProducto")
public class Estado_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String nombreEstado;

    public Estado_Producto() {
    }

    public Estado_Producto(Long idEstado, String nombreEstado) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}
