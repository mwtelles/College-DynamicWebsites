package br.com.uvass.springbooth2.model.repository;

import br.com.uvass.springbooth2.model.entity.Avaliacao;
import br.com.uvass.springbooth2.model.entity.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class UsuarioRepository {
    private JdbcTemplate jdbcTemplate;

    public UsuarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Usuario> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        ArrayList<Usuario> buscar = (ArrayList<Usuario>) jdbcTemplate.query(sql, new UsuarioMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Usuario>) jdbcTemplate.query(sql, new Object[]{id}, new UsuarioMapper());
        }
        throw new Exception("Não encontramos nenhum usuário com o ID informado");
    }

    public Usuario adicionar(Usuario usuario) throws Exception {
        String sql = "insert into usuario(id, nome, email, senha) values (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha()
        );

        if(insert == 1) {
            return usuario;
        }

        throw new Exception("Ops! Houve um erro ao inserir o usuário");
    }
}
