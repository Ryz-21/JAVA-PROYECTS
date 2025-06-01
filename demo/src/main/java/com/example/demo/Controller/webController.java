package com.example.demo.Controller;

import com.example.demo.Model.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class webController {

    private final List<Registro> datos = new ArrayList<>();
    private int contadorId = 1; // contador para el ID auto-incrementable

    @GetMapping("/inicio")
    public String mostrarInicio(Model model) {
        model.addAttribute("datos", datos);
        return "inicio";
    }

    @PostMapping("/procesar")
    public String procesarFormulario(@RequestParam String campo1,
                                     @RequestParam String campo2,
                                     @RequestParam String campo3,
                                     @RequestParam String campo4) {
        Registro nuevoRegistro = new Registro(contadorId++, campo1, campo2, campo3, campo4);
        datos.add(nuevoRegistro);
        return "redirect:/inicio";
    }

    @PostMapping("/eliminar")
    public String eliminarRegistro(@RequestParam int index) {
        if (index >= 0 && index < datos.size()) {
            datos.remove(index);
        }
        return "redirect:/inicio";
    }

    @PostMapping("/modificar")
    public String modificarRegistro(@RequestParam int index,
                                     @RequestParam String campo1,
                                     @RequestParam String campo2,
                                     @RequestParam String campo3,
                                     @RequestParam String campo4) {
        if (index >= 0 && index < datos.size()) {
            Registro reg = datos.get(index);
            reg.setCampo1(campo1);
            reg.setCampo2(campo2);
            reg.setCampo3(campo3);
            reg.setCampo4(campo4);
        }
        return "redirect:/inicio";
    }
}