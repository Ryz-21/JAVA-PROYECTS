/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EA1.EA1.Controller;

import com.EA1.EA1.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/Producto")
public class ProductoController {
    @GetMapping("/form")
    public String mostrarFormulario(Model model)
    {
        model.addAttribute("Producto" , new Producto());
        return "formulario_producto";
    }
@PostMapping("/Registrar")
public String registrarProducto(@ModelAttribute Producto producto, BindingResult result, Model model) {
    if (result.hasErrors()) {
        // Manejar errores de validación
        return "formulario_producto";
    }
    model.addAttribute("producto", producto);
    return "exito_producto";
}

}
