INSERT INTO CATEGORIA (NOME) VALUES ('Informática');
INSERT INTO CATEGORIA (NOME) VALUES ('Escritório');

INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Computador', 2000);
INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Impressora', 800);
INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Mouse', 80);

INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (1,1);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (2,1);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (2,2);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (3,1);

INSERT INTO ESTADO (NOME) VALUES ('Minas Gerais');
INSERT INTO ESTADO (NOME) VALUES ('São Paulo');

INSERT INTO CIDADE (NOME,ESTADO_ID) VALUES ('Uberlândia', 1);
INSERT INTO CIDADE (NOME,ESTADO_ID) VALUES ('São Paulo', 2);
INSERT INTO CIDADE (NOME,ESTADO_ID) VALUES ('Campinas', 2);

INSERT INTO CLIENTE (NOME,EMAIL,CPF_OU_CNPJ,TIPO) VALUES ('Maria Silva', 'maria@gmail.com', '36378912377', 1);

INSERT INTO TELEFONE (CLIENTE_ID,TELEFONES) VALUES (1, 27363323);
INSERT INTO TELEFONE (CLIENTE_ID,TELEFONES) VALUES (1, 93838393);

INSERT INTO ENDERECO (LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,CEP,CLIENTE_ID,CIDADE_ID) VALUES ('Rua Flores', '300', 'Apto 303', 'Jardim', '38220834', 1, 1);
INSERT INTO ENDERECO (LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,CEP,CLIENTE_ID,CIDADE_ID) VALUES ('Avenida Matos', '105', 'Sala 800', 'Centro', '38777012', 1, 2);

INSERT INTO PEDIDO (INSTANTE,CLIENTE_ID,ENDERECO_DE_ENTREGA_ID) VALUES ('2017-09-30 10:32', 1, 1);
INSERT INTO PEDIDO (INSTANTE,CLIENTE_ID,ENDERECO_DE_ENTREGA_ID) VALUES ('2017-10-10 19:35', 1, 2);

INSERT INTO PAGAMENTO (PEDIDO_ID,ESTADO) VALUES (1, 2);
INSERT INTO PAGAMENTO (PEDIDO_ID,ESTADO) VALUES (2, 1);

INSERT INTO PAGAMENTO_COM_CARTAO (PEDIDO_ID,NUMERODE_PARCELAS) VALUES (1, 6);
INSERT INTO PAGAMENTO_COM_BOLETO (PEDIDO_ID,DATA_PAGAMENTO,DATA_VENCIMENTO) VALUES (2,NULL,'2017-10-20 00:00');
