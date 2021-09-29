package br.com.uvass.springbooth2.model.repository;

import br.com.uvass.springbooth2.model.entity.Avaliacao;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AvaliacaoMapper implements RowMapper<Avaliacao> {
    @Override
    public Avaliacao mapRow(ResultSet resultSet, int i) throws SQLException {
        Avaliacao produto = new Avaliacao();
        produto.setId(resultSet.getInt("id"));
        produto.setDataCriacao(resultSet.getDate("dataCriacao").toLocalDate());
        produto.setDataLimite(resultSet.getDate("dataLimite").toLocalDate());

        return produto;
    }
}
