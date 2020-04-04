CREATE TABLE usuario(
	id BIGINT(20) PRIMARY KEY,
	nome VARCHAR(60) NOT NULL,
	email VARCHAR(60) NOT NULL,
	senha VARCHAR(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE permissao(
	id BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE usuario_permissao(
	id_usuario BIGINT(20) NOT NULL,
	id_permissao BIGINT(20) NOT NULL,
	PRIMARY KEY (id_usuario, id_permissao),
	FOREIGN KEY (id_usuario) REFERENCES usuario(id),
	FOREIGN KEY (id_permissao) REFERENCES permissao(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO usuario(id, nome, email, senha) values(1, 'Diego Hartwig', 'hartwig.diego@gmail.com', '$2a$10$WHz6qgEd4eJ3pmKY7lSyzOX1Op/omGtvzFuifGKq0Y3WeTpgrPYiW');
INSERT INTO usuario(id, nome, email, senha) values(2, 'usuario', 'usuario@teste.com', '$2a$10$WHz6qgEd4eJ3pmKY7lSyzOX1Op/omGtvzFuifGKq0Y3WeTpgrPYiW');

INSERT INTO permissao(id, descricao) values (1, 'ROLE_CADASTRAR_CATEGORIA');
INSERT INTO permissao(id, descricao) values (2, 'ROLE_PESQUISAR_CATEGORIA');

INSERT INTO permissao(id, descricao) values (3, 'ROLE_CADASTRAR_PESSOA');
INSERT INTO permissao(id, descricao) values (4, 'ROLE_REMOVER_PESSOA');
INSERT INTO permissao(id, descricao) values (5, 'ROLE_PESQUISAR_PESSOA');

INSERT INTO permissao(id, descricao) values (6, 'ROLE_CADASTRAR_LANCAMENTO');
INSERT INTO permissao(id, descricao) values (7, 'ROLE_REMOVER_LANCAMENTO');
INSERT INTO permissao(id, descricao) values (8, 'ROLE_PESQUISAR_LANCAMENTO');

INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 1);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 2);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 3);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 4);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 5);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 6);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 7);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (1, 8);

INSERT INTO usuario_permissao(id_usuario, id_permissao) values (2, 2);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (2, 5);
INSERT INTO usuario_permissao(id_usuario, id_permissao) values (2, 8);

