CREATE TABLE Usuario (
                         id INT NOT NULL,
                         nome  VARCHAR(255) NOT NULL,
                         email VARCHAR(255) NOT NULL,
                         senha VARCHAR(255) NOT NULL
);

CREATE TABLE Aluno (
                         id INT NOT NULL,
                         matricula VARCHAR(255) NOT NULL
    );

CREATE TABLE Curso (
                       id INT NOT NULL,
                       nome  VARCHAR(255) NOT NULL
);

CREATE TABLE Disciplina (
                            id INT NOT NULL,
                            nome VARCHAR(255) NOT NULL,
                            cursoId INT NOT NULL,
                            FOREIGN KEY (cursoId) REFERENCES curso(id)
);

CREATE TABLE Professor (
                         id INT NOT NULL,
                         nomeCompleto  VARCHAR(255) NOT NULL,
                         disciplinaId INT NOT NULL,
                         FOREIGN KEY (disciplinaId) REFERENCES disciplina(id)
);

CREATE TABLE Avaliado (
                          id INT NOT NULL,
                          professorId INT NOT NULL,
                          disciplinaId INT NOT NULL,
                          FOREIGN KEY (professorId) REFERENCES professor(id),
                          FOREIGN KEY (disciplinaId) REFERENCES disciplina(id)
);

CREATE TABLE Avaliacao (
                         id INT NOT NULL,
                         nome  VARCHAR(255) NOT NULL,
                         dataCriacao VARCHAR(255),
                         dataLimite VARCHAR(255)
);