package br.com.uvass.springbooth2.model.entity;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(Integer id, String nome, String email, String senha, String matricula) {
        super(id, nome, email, senha);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
}

