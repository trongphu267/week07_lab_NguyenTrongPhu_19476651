package com.example.backend.controller;

import com.example.backend.services.CurtomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurtomerController {
    private CurtomerService curtomerService;
    public CurtomerController(CurtomerService curtomerService){
        super();
        this.curtomerService = curtomerService;
    }
    @GetMapping("/customers")
    public String listCutomer(Model model){
        model.addAttribute("customers",curtomerService.getAllCurtomer());
        return "customer";
    }
}
