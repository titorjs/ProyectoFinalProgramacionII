-- INICIAL

DROP TABLE partidos;
DROP TABLE candidatos_general_p;
drop table candidatos_general_v;
DROP TABLE candidatos_facultad_v;
DROP TABLE candidatos_facultad_p;
DROP TABLE estado_proceso;
drop table registro_votos;

CREATE TABLE partidos(
nombre varchar(50),
presidente varchar(50),
firmas int DEFAULT 0,
eslogan varchar(50),
g_FAD INT DEFAULT 0,
f_FAD INT DEFAULT 0,
g_ECPRI INT DEFAULT 0,
f_ECPRI INT DEFAULT 0,
g_FCS INT DEFAULT 0,
f_FCS INT DEFAULT 0,
g_FACEA INT DEFAULT 0,
f_FACEA INT DEFAULT 0,
g_FCAA INT DEFAULT 0,
f_FCAA INT DEFAULT 0,
g_DERECHO INT DEFAULT 0,
f_DERECHO INT DEFAULT 0,
g_GASTRONOMIA INT DEFAULT 0,
f_GASTRONOMIA INT DEFAULT 0,
g_TURISMO INT DEFAULT 0,
f_TURISMO INT DEFAULT 0,
g_FICA INT DEFAULT 0,
f_FICA INT DEFAULT 0,
g_MEDICINA INT DEFAULT 0,
f_MEDICINA INT DEFAULT 0,
g_MUSICA INT DEFAULT 0,
f_MUSICA INT DEFAULT 0,
g_PSICOLOGIA INT DEFAULT 0,
f_PSICOLOGIA INT DEFAULT 0,
g_ODONTOLOGIA INT DEFAULT 0,
f_ODONTOLOGIA INT DEFAULT 0
);

CREATE TABLE candidatos_general_p(
	id VARCHAR(50),
    partido VARCHAR(50),
    propuesta_1 VARCHAR(150),
    propuesta_2 VARCHAR(150),
    propuesta_3 VARCHAR(150),
    propuesta_4 VARCHAR(150),
    propuesta_5 VARCHAR(150)
);

CREATE TABLE candidatos_general_v(
	id VARCHAR(50),
    partido VARCHAR(50),
    propuesta_1 VARCHAR(150),
    propuesta_2 VARCHAR(150),
    propuesta_3 VARCHAR(150),
    propuesta_4 VARCHAR(150),
    propuesta_5 VARCHAR(150)
);

CREATE TABLE candidatos_facultad_p(
	id VARCHAR(50),
    partido VARCHAR(50),
    facultad VARCHAR(50),
    propuesta_1 VARCHAR(150),
    propuesta_2 VARCHAR(150),
    propuesta_3 VARCHAR(150),
    propuesta_4 VARCHAR(150),
    propuesta_5 VARCHAR(150)
);

CREATE TABLE candidatos_facultad_v(
	id VARCHAR(50),
    partido VARCHAR(50),
    facultad VARCHAR(50),
    propuesta_1 VARCHAR(150),
    propuesta_2 VARCHAR(150),
    propuesta_3 VARCHAR(150),
    propuesta_4 VARCHAR(150),
    propuesta_5 VARCHAR(150)
);

create table registro_votos(
	hora VARCHAR(8),
    proveniente VARCHAR(50),
    general VARCHAR(50),
    facultad VARCHAR(50)
);

CREATE TABLE estado_proceso(
	estado int,
 id VARCHAR(50)
);

insert into estado_proceso (estado, id)
VALUEs (0, '2023-02-02');

INSERT INTO partidos(nombre, presidente, eslogan)
VALUES ('blanco','blanco','blanco');

UPDATE estudiantes SET aVotado = 'false' WHERE aVotado = 'true';