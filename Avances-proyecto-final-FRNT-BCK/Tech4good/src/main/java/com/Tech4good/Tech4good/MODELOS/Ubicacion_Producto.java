package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="ubicacionProducto")
public class Ubicacion_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long  idUbicacion;
    private String nombreUbicacion;

    public Ubicacion_Producto() {
    }

    public Ubicacion_Producto(Long idUbicacion, String nombreUbicacion) {
        this.idUbicacion = idUbicacion;
        this.nombreUbicacion = nombreUbicacion;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }
}
