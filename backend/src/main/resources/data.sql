INSERT INTO CATEGORIA (NOME) VALUES ('Informática');
INSERT INTO CATEGORIA (NOME) VALUES ('Escritório');

INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Computador', 2000);
INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Impressora', 800);
INSERT INTO PRODUTO (NOME,PRECO) VALUES ('Mouse', 80);

INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (1,1);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (2,1);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (2,2);
INSERT INTO PRODUTO_CATEGORIA (PRODUTO_ID,CATEGORIA_ID) VALUES (3,1);
