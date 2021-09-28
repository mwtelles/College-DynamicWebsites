INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'https://elojobhigh.com.br/assets/img/elojob.webp', 'ELO JOB', 'É uma ótima escolha para quem quer agilidade no serviço, iremos jogar na sua conta até atingir a divisão solicitada, você pode customizar lane/campeões e muito mais!');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (2, 'https://elojobhigh.com.br/assets/img/duoboost.webp', 'DUO BOOST', 'Você quer o máximo de segurança para você e sua conta? Jogue duo com um Challenger e aprenda as melhores técnicas para subir de ELO!');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (3, 'https://elojobhigh.com.br/assets/img/vitorias.webp', 'MD10', 'Nós iremos garantir 80% de vitórias na sua MD10, os melhores Boosters são selecionados para fazer esse tipo de serviço e garantir as vitórias!');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'RANQUEADA SOLO/DUO', 'Você pode escolher adicionais no momento de finalizar o pedido, como por exemplo: Flash no D ou no F, campeões específicos, horários específicos, chat offline, streaming do serviço, rotas específicas.', 'https://elojobhigh.com.br/assets/img/badges/high-1.png', '2021-09-26', CURRENT_TIMESTAMP(), '25.00');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (2, 'RANQUEADA FLEX', 'Você pode escolher adicionais no momento de finalizar o pedido, como por exemplo: Flash no D ou no F, campeões específicos, horários específicos, chat offline, streaming do serviço, rotas específicas.', 'https://elojobhigh.com.br/assets/img/badges/high-1.png', '2021-09-26', CURRENT_TIMESTAMP(), '30.00');

INSERT INTO produtoCategoria(id, produtoId, categoriaId)
VALUES (1, 1, 1);

INSERT INTO produtoCategoria(id, produtoId, categoriaId)
VALUES (2, 2, 2);

insert into tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
values (1, '20OFF', 'A ELO HIGH está oferecendo 20% OFF para você arrebentar nessa temporada. E você ainda ganha cortesias! Posição de feitiços, chat offline, campeões e rotas específicas de graça. Use o cupom HIGH20.', '2021-09-26',  '2021-11-12', '2021-09-26', CURRENT_TIMESTAMP());

insert into promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, produtoId, promocaoId)
values (1, 20.00, '2021-09-26', CURRENT_TIMESTAMP(), 1, 1);
