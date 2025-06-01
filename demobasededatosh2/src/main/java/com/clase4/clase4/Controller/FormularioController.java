package com.clase4.clase4.Controller;

import com.clase4.clase4.Model.Formulario;
import com.clase4.clase4.repository.FormularioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FormularioController {

@GetMapping("/")
public String redireccionInicio() {
    return "redirect:/listarFormularios";
}
    @Autowired
    private FormularioRepository formularioRepository;

    @PostMapping("/submitFormulario")
    public String procesarFormulario(@ModelAttribute Formulario formulario, Model model) {
        formularioRepository.save(formulario);
        model.addAttribute("formulario", formulario);
        return "redirect:/listarFormularios";
    }

    @GetMapping("/listarFormularios")
    public String listarFormularios(Model model) {
        List<Formulario> formularios = formularioRepository.findAll();
        model.addAttribute("formularios", formularios);
        model.addAttribute("formulario", new Formulario());
        return "Listar";
    }

    @GetMapping("/editarFormulario/{id}")
    public String editarFormulario(@PathVariable("id") long id, Model model) {
        Formulario formulario = formularioRepository.findById(id).orElse(null);
        if (formulario != null) {
            model.addAttribute("formulario", formulario);
            return "formulario";
        }
        return "redirect:/listarFormularios";
    }

    @PostMapping("/submitEdicionFormulario")
    public String submitEdicionFormulario(@ModelAttribute Formulario formulario, Model model) {
        if (formulario.getId() != null) {
            Formulario formularioExistente = formularioRepository.findById(formulario.getId()).orElse(null);
            if (formularioExistente != null) {
                formularioExistente.setNombre(formulario.getNombre());
                formularioExistente.setEmil(formulario.getEmil());
                formularioExistente.setMensaje(formulario.getMensaje());
                formularioRepository.save(formularioExistente);
                model.addAttribute("formulario", formularioExistente);
            }
        }
        return "redirect:/listarFormularios";
    }

    @GetMapping("/eliminarFormulario{id}")
    public String eliminarFormulario(@PathVariable("id") long id) {
        formularioRepository.deleteById(id);
        return "redirect:/listarFormularios";
    }
}
