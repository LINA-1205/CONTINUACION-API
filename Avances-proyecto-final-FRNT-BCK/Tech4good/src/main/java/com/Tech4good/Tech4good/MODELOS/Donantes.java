package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "Donantes")
public class Donantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "telefono_usuario")
    private String telefonoUsuario;

    @Column(name = "tipo_de_usuario")
    private String tipoDeUsuario;


    @ManyToOne
    @JoinColumn(name = "tipo_producto_id")
    private Tipo_Producto tipoProducto;

    @ManyToOne
    @JoinColumn(name = "ubicacion_producto_id")
    private Ubicacion_Producto ubicacionProducto;

    @ManyToOne
    @JoinColumn(name = "estado_producto_id")
    private Estado_Producto estadoProducto;


    public Donantes() {
    }


    public Donantes(String nombreUsuario, String numeroDocumento, String telefonoUsuario, String tipoDeUsuario, Tipo_Producto tipoProducto, Ubicacion_Producto ubicacionProducto, Estado_Producto estadoProducto) {
        this.nombreUsuario = nombreUsuario;
        this.numeroDocumento = numeroDocumento;
        this.telefonoUsuario = telefonoUsuario;
        this.tipoDeUsuario = tipoDeUsuario;
        this.tipoProducto = tipoProducto;
        this.ubicacionProducto = ubicacionProducto;
        this.estadoProducto = estadoProducto;
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }


    public Tipo_Producto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(Tipo_Producto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Ubicacion_Producto getUbicacionProducto() {
        return ubicacionProducto;
    }

    public void setUbicacionProducto(Ubicacion_Producto ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    public Estado_Producto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Estado_Producto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
}
