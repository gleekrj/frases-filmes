package br.com.alura.frases_filme.service;

import br.com.alura.frases_filme.DTO.FraseDTO;
import br.com.alura.frases_filme.model.Frase;
import br.com.alura.frases_filme.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {

//        List<Frase> frasesCadastradas = repositorio.findAll();
//        Collections.shuffle(frasesCadastradas);
//
//        Frase frase = frasesCadastradas.stream().findFirst().get();

        Frase frase = repositorio.buscaFraseAleatoria();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

}
