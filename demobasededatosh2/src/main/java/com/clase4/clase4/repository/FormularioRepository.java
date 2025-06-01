/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clase4.clase4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clase4.clase4.Model.Formulario;

import org.springframework.stereotype.Repository;
@Repository
public interface FormularioRepository extends  JpaRepository <Formulario , Long> {
    
}
