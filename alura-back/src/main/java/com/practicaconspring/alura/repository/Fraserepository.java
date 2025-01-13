package com.practicaconspring.alura.repository;

import com.practicaconspring.alura.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Fraserepository  extends JpaRepository <Frase,Long>{

    @Query("SELECT f FROM Frase f order by function('RANDOM')LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
