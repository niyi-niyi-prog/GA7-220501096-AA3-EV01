package com.cashflowhogar.controller;


import com.cashflowhogar.model.Movimiento;
import com.cashflowhogar.service.MovimientoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movimientos")
public class MovimientoController {

    private final MovimientoService service;

    public MovimientoController(MovimientoService service) {
        this.service = service;
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("movimiento", new Movimiento());
        return "formulario"; // formulario.html en templates
    }


    @GetMapping
    public String listar(Model model) {
        model.addAttribute("movimientos", service.listar());
        return "lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("movimiento", new Movimiento());
        return "formulario";
    }

    @PostMapping
    public String guardar(@ModelAttribute Movimiento movimiento) {
        service.guardar(movimiento);
        return "redirect:/movimientos";
    }
}
