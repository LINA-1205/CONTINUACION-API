package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="Cuentas")
public class Cuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcuenta;
    private String correoElectronicoUsuario;
    private String contraseña;

    public Cuentas() {
    }

    public Cuentas(String correoElectronicoUsuario, String contraseña) {
        this.correoElectronicoUsuario = correoElectronicoUsuario;
        this.contraseña = contraseña;
    }

    public String getCorreoElectronicoUsuario() {
        return correoElectronicoUsuario;
    }

    public void setCorreoElectronicoUsuario(String correoElectronicoUsuario) {
        this.correoElectronicoUsuario = correoElectronicoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
