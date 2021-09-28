package br.com.uvass.springbooth2.model.entity;

public class Professor {
    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
