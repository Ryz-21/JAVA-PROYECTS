/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EA1.EA1.Controller;

import com.EA1.EA1.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Paciente")
public class PacienteController {
    @GetMapping("/form")
    public String MostrarFormulario(Model model)
{
    model.addAttribute("Paciente", new Paciente());
    return "formulario_paciente";
    
}
    @PostMapping("/Registrar")
        public String registrarPaciente(@ModelAttribute Paciente paciente, Model model) {
        model.addAttribute("paciente", paciente);
        return "exito_paciente";
        }
}

 
