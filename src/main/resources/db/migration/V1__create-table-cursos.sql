--  Essa parte nós criamos o banco de dados a partir daqui, o flyway já cria a tabela, mas precisamos criar o banco
-- de dados primeiro!

CREATE TABLE cursos(
                       id BIGINT NOT NULL AUTO_INCREMENT,
                       nome VARCHAR(100) NOT NULL,
                       periodo VARCHAR(20),
                       ativo BOOLEAN NOT NULL DEFAULT TRUE,

                       PRIMARY KEY (id),

                       CONSTRAINT uq_cursos_nome UNIQUE(nome),
                       CONSTRAINT  chk_cursos_periodo CHECK (periodo in ( 'MATUTINO','VESPERTINO','INTEGRAL' ))



);