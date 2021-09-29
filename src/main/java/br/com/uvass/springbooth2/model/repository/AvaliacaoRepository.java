package br.com.uvass.springbooth2.model.repository;

import br.com.uvass.springbooth2.model.entity.Avaliacao;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class AvaliacaoRepository {

    private JdbcTemplate jdbcTemplate;

    public AvaliacaoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Avaliacao> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT * FROM avaliacao WHERE id = ?";
        ArrayList<Avaliacao> buscar = (ArrayList<Avaliacao>) jdbcTemplate.query(sql, new AvaliacaoMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Avaliacao>) jdbcTemplate.query(sql, new Object[]{id}, new AvaliacaoMapper());
        }
        throw new Exception("Nenhuma avaliação encontrada com este ID");
    }

    public Avaliacao adicionar(Avaliacao avaliacao) throws Exception {
        String sql = "insert into avaliacao(id, dataCriacao, dataLimite) values (?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                avaliacao.getId(),
                avaliacao.getDataCriacao(),
                avaliacao.getDataLimite()
        );

        if(insert == 1) {
            return avaliacao;
        }

        throw new Exception("Erro ao inserir a avaliacao");
    }

}
