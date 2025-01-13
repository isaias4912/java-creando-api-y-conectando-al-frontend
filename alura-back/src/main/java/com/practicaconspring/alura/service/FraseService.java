package com.practicaconspring.alura.service;


import com.practicaconspring.alura.Frase;
import com.practicaconspring.alura.dto.FraseDTO;
import com.practicaconspring.alura.repository.Fraserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private Fraserepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return  new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }

}
