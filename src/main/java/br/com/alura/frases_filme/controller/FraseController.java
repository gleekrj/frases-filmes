package br.com.alura.frases_filme.controller;

import br.com.alura.frases_filme.DTO.FraseDTO;
import br.com.alura.frases_filme.model.Frase;
import br.com.alura.frases_filme.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();

    }

}
