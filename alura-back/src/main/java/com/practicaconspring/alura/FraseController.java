package com.practicaconspring.alura;


import com.practicaconspring.alura.dto.FraseDTO;
import com.practicaconspring.alura.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseService servicio;


    @GetMapping("series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();

    }

}
