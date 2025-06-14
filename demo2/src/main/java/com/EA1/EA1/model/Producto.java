/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EA1.EA1.model;

/**
 *
 * @author LAB_P01
 */
public class Producto {

    
    private String nombre;
    private String fechaCaducidad;
    private int stockMinimo;
    private int stockMaximo;
    private double precioUnitario;
    private String categoria;
    private String marca;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Producto() {
    }

    public Producto(String nombre, String fechaCaducidad, int stockMinimo, int stockMaximo, double precioUnitario, String categoria, String marca) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.marca = marca;
    }
    
 
}
