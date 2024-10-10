package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Donaciones")
public class Donaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDonacion;
    private Long idUsuario;
    private Long idProducto;
    private LocalDate fechaDonacion;
    private String estadoDonacion;

    public Donaciones() {
    }

    public Donaciones(Long idDonacion, Long idUsuario, Long idProducto, LocalDate fechaDonacion, String estadoDonacion) {
        this.idDonacion = idDonacion;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.fechaDonacion = fechaDonacion;
        this.estadoDonacion = estadoDonacion;
    }

    public Long getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Long idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public LocalDate getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(LocalDate fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getEstadoDonacion() {
        return estadoDonacion;
    }

    public void setEstadoDonacion(String estadoDonacion) {
        this.estadoDonacion = estadoDonacion;
    }
}
