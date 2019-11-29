package com.example.ferreteria;

import java.util.Date;

public class Producto {
    String nombre, descripcion, aclaracion, marca, vencimiento;
    Integer precio, cantidad;

    public Producto(String nombre, String descripcion, String aclaracion, String marca, Integer precio, Integer cantidad, String vencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.aclaracion = aclaracion;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAclaracion(String aclaracion) {
        this.aclaracion = aclaracion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAclaracion() {
        return aclaracion;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public String getVencimiento() {
        return vencimiento;
    }


}
