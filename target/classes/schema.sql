CREATE TABLE categoria(
                          id                  INT            NOT NULL,
                          ImagemSimboloUrl    VARCHAR (8000),
                          nome                VARCHAR (100)   NOT NULL,
                          descricao           VARCHAR (500)
);

CREATE TABLE produto (
                         id                        INT           NOT NULL,
                         nome                      VARCHAR(100)   NOT NULL,
                         descricao                 VARCHAR(500),
                         fotoUrl                   VARCHAR(8000),
                         dataCadastro              DATE,
                         dataUltimaAtualizacao     TIMESTAMP     NOT NULL,
                         valorUnitario             FLOAT(5.2)
    );

CREATE TABLE produtoCategoria (
                                  id           INT NOT NULL,
                                  produtoId    INT NOT NULL,
                                  categoriaId  INT NOT NULL,

                                  FOREIGN KEY (categoriaId) REFERENCES categoria(id),
                                  FOREIGN KEY (produtoId) REFERENCES produto(id)
);

CREATE TABLE tabelaPromocao(
                               id INT NOT NULL,
                               nome VARCHAR(100) NOT NULL,
                               descricao VARCHAR(500),
                               dataInicio DATE,
                               dataFim DATE,
                               dataCadastro DATE,
                               dataUltimaAtualizacao TIMESTAMP NOT NULL
);

CREATE TABLE promocaoItem (
                              id INT NOT NULL,
                              valorPromocao FLOAT,
                              dataCadastro DATE,
                              dataUltimaAtualizacao TIMESTAMP NOT NULL,
                              produtoId INT NOT NULL,
                              promocaoId INT NOT NULL,

                              FOREIGN KEY (promocaoId) REFERENCES tabelaPromocao(id),
                              FOREIGN KEY (produtoId) REFERENCES produto(id)
);