/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex.modelo;

/**
 *
 * @author ArnaldoAndres
 */
public class Estudiante {

    private String nombre;
    private String codigo;
    private String fechaIngreso;
    private String direccion;
    private String telefonoFijo;
    private String telefonoCelular;
    private String correoElectronico;

    public Estudiante() {
        this.nombre = "";
        this.codigo = "";
        this.fechaIngreso = "";
        this.direccion = "";
        this.telefonoFijo = "";
        this.telefonoCelular = "";
        this.correoElectronico = "";
    }

    public Estudiante(String nombre, String codigo, String fechaIngreso, String direccion, String telefonoFijo, String telefonoCelular, String email) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.correoElectronico = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + getNombre() + ", codigo=" + getCodigo() + ", fechaIngreso=" + getFechaIngreso() + ", direccion=" + getDireccion() + ", telefonoFijo=" + getTelefonoFijo() + ", telefonoCelular=" + getTelefonoCelular() + ", correoElectronico=" + getCorreoElectronico() + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
