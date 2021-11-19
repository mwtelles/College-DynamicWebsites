package br.com.uvass.springbooth2.model.repository;

import br.com.uvass.springbooth2.model.entity.Avaliacao;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AvaliacaoMapper implements RowMapper<Avaliacao> {
    @Override
    public Avaliacao mapRow(ResultSet resultSet, int i) throws SQLException {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setId(resultSet.getInt("id"));
        avaliacao.setNome(resultSet.getString("nome"));
        avaliacao.setDataCriacao(resultSet.getString("dataCriacao"));
        avaliacao.setDataLimite(resultSet.getString("dataLimite"));

        return avaliacao;
    }
}
