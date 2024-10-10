package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private Long idTipo;
    private Long idEstado;
    private Long idUbicacion;
    private String marca;
    private String modelo;
    private String descripcion;

    public Inventario() {
    }

    public Inventario(Long idProducto, Long idTipo, Long idEstado, Long idUbicacion, String marca, String modelo, String descripcion) {
        this.idProducto = idProducto;
        this.idTipo = idTipo;
        this.idEstado = idEstado;
        this.idUbicacion = idUbicacion;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
