package br.com.alura.frases_filme.repository;

import br.com.alura.frases_filme.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {


    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();

}
