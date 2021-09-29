package br.com.uvass.springbooth2.controller;

import br.com.uvass.springbooth2.model.entity.Avaliacao;
import br.com.uvass.springbooth2.model.repository.AvaliacaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    private AvaliacaoRepository avaliacaoRepository;

    public AvaliacaoController(JdbcTemplate jdbcTemplate) {
        avaliacaoRepository = new AvaliacaoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Avaliacao inserir(@RequestBody Avaliacao avaliacao) throws Exception {
        return avaliacaoRepository.adicionar(avaliacao);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Avaliacao> buscarPorId(@PathVariable Integer id) throws Exception {
        return avaliacaoRepository.buscarPorId(id);
    }
}
