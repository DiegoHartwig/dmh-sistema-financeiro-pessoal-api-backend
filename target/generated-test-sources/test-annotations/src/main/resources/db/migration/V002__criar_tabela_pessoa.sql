CREATE TABLE pessoa (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	ativo TINYINT(1),
	logradouro VARCHAR(100) NULL,
	numero VARCHAR(10) NULL,
	complemento VARCHAR(100) NULL,
	bairro VARCHAR(50) NULL,
	cep VARCHAR (9) NULL,
	cidade VARCHAR (50) NULL,
	estado VARCHAR (2) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

