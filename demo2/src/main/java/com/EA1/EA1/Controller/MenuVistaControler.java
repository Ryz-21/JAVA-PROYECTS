/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EA1.EA1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author LAB_P01
 */
@Controller
public class MenuVistaControler {
   @GetMapping("/")
   public String Menu()
   {
       return "Menu";
   }
}
