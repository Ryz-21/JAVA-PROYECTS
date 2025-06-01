/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase4.clase4.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Formulario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long  id;
    private String nombre;
    private String emil;
    private String mensaje;
    
    
    public Formulario() {}
 
    public Formulario(Long id, String nombre, String emil, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.emil = emil;
        this.mensaje = mensaje;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   
       
}
