-- VOTOS
-- FAD,
--         ECPRI,
--         FCS,
--         FACEA,
--         FCAA,
--         DERECHO,
--         GASTRONOMIA,
--         TURISMO,
--         FICA,
--         MEDICINA,
--         MUSICA,
--         PSICOLOGIA,
--         ODONTOLOGIA


UPDATE partidos SET 
        f_FAD = 5,
        f_ECPRI = 1,
        f_FCS = 3,
        f_FACEA = 4,
        f_FCAA = 2,
        f_DERECHO = 3,
        f_GASTRONOMIA = 2,
        f_TURISMO = 5,
        f_FICA = 4,
        f_MEDICINA = 3,
        f_MUSICA = 2,
        f_PSICOLOGIA = 1,
        f_ODONTOLOGIA = 2,
        g_FAD = 2,
        g_ECPRI = 3,
        g_FCS = 3,
        g_FACEA = 2,
        g_FCAA = 1,
        g_DERECHO = 2,
        g_GASTRONOMIA = 1,
        g_TURISMO = 2,
        g_FICA = 3,
        g_MEDICINA = 4,
        g_MUSICA = 4,
        g_PSICOLOGIA = 2,
        g_ODONTOLOGIA = 1
WHERE nombre = 'APE';

UPDATE partidos SET 
        f_FAD = 0,
        f_ECPRI = 2,
        f_FCS = 1,
        f_FACEA = 1,
        f_FCAA = 2,
        f_DERECHO = 2,
        f_GASTRONOMIA = 0,
        f_TURISMO = 0,
        f_FICA = 0,
        f_MEDICINA = 0,
        f_MUSICA = 0,
        f_PSICOLOGIA = 1,
        f_ODONTOLOGIA = 2,
        g_FAD = 3,
        g_ECPRI = 2,
        g_FCS = 1,
        g_FACEA = 1,
        g_FCAA = 1,
        g_DERECHO = 3,
        g_GASTRONOMIA = 0,
        g_TURISMO = 0,
        g_FICA = 0,
        g_MEDICINA = 1,
        g_MUSICA = 0,
        g_PSICOLOGIA = 2,
        g_ODONTOLOGIA = 0
WHERE nombre = 'FEIDD';

UPDATE partidos SET 
        f_FAD = 0,
        f_ECPRI = 2,
        f_FCS = 0,
        f_FACEA = 0,
        f_FCAA = 0,
        f_DERECHO = 0,
        f_GASTRONOMIA = 0,
        f_TURISMO = 0,
        f_FICA = 1,
        f_MEDICINA = 0,
        f_MUSICA = 0,
        f_PSICOLOGIA = 0,
        f_ODONTOLOGIA = 0,
        g_FAD = 0,
        g_ECPRI = 0,
        g_FCS = 0,
        g_FACEA = 0,
        g_FCAA = 2,
        g_DERECHO = 0,
        g_GASTRONOMIA = 0,
        g_TURISMO = 0,
        g_FICA = 0,
        g_MEDICINA = 0,
        g_MUSICA = 0,
        g_PSICOLOGIA = 0,
        g_ODONTOLOGIA = 0
WHERE nombre = 'CRE';

UPDATE partidos SET 
        f_FAD = 0,
        f_ECPRI = 0,
        f_FCS = 1,
        f_FACEA = 0,
        f_FCAA = 1,
        f_DERECHO = 0,
        f_GASTRONOMIA = 3,
        f_TURISMO = 0,
        f_FICA = 0,
        f_MEDICINA = 2,
        f_MUSICA = 3,
        f_PSICOLOGIA = 3,
        f_ODONTOLOGIA = 1,
        g_FAD = 0,
        g_ECPRI = 0,
        g_FCS = 1,
        g_FACEA = 2,
        g_FCAA = 1,
        g_DERECHO = 0,
        g_GASTRONOMIA = 4,
        g_TURISMO = 3,
        g_FICA = 2,
        g_MEDICINA = 0,
        g_MUSICA = 1,
        g_PSICOLOGIA = 1,
        g_ODONTOLOGIA = 4
WHERE nombre = 'blanco';

INSERT INTO registro_votos VALUES ('12:04:05', 'FAD', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FAD', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FAD', 'FEIDD', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FAD', 'FEIDD', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FAD', 'FEIDD', 'APE');

INSERT INTO registro_votos VALUES ('12:04:05', 'ECPRI', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'ECPRI', 'APE', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'ECPRI', 'APE', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'ECPRI', 'FEIDD', 'CRE');
INSERT INTO registro_votos VALUES ('12:04:05', 'ECPRI', 'FEIDD', 'CRE');

INSERT INTO registro_votos VALUES ('12:04:05', 'FACEA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FACEA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FACEA', 'FEIDD', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FACEA', 'blanco', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FACEA', 'blanco', 'FEIDD');

INSERT INTO registro_votos VALUES ('12:04:05', 'FCAA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FCAA', 'FEIDD', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FCAA', 'CRE', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'FCAA', 'CRE', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'FCAA', 'blanco', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'DERECHO', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'DERECHO', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'DERECHO', 'FEIDD', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'DERECHO', 'FEIDD', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'DERECHO', 'FEIDD', 'FEIDD');

INSERT INTO registro_votos VALUES ('12:04:05', 'GASTRONOMIA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'GASTRONOMIA', 'blanco', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'GASTRONOMIA', 'blanco', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'GASTRONOMIA', 'blanco', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'GASTRONOMIA', 'blanco', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'TURISMO', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'TURISMO', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'TURISMO', 'blanco', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'TURISMO', 'blanco', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'TURISMO', 'blanco', 'APE');

INSERT INTO registro_votos VALUES ('12:04:05', 'FICA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FICA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FICA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'FICA', 'APE', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'FICA', 'CRE', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'MEDICINA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'MEDICINA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'MEDICINA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'MEDICINA', 'APE', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'MEDICINA', 'FEIDD', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'MUSICA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'MUSICA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'MUSICA', 'APE', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'MUSICA', 'APE', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'MUSICA', 'blanco', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'PSICOLOGIA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'PSICOLOGIA', 'APE', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'PSICOLOGIA', 'FEIDD', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'PSICOLOGIA', 'FEIDD', 'blanco');
INSERT INTO registro_votos VALUES ('12:04:05', 'PSICOLOGIA', 'blanco', 'blanco');

INSERT INTO registro_votos VALUES ('12:04:05', 'ODONTOLOGIA', 'APE', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'ODONTOLOGIA', 'blanco', 'APE');
INSERT INTO registro_votos VALUES ('12:04:05', 'ODONTOLOGIA', 'blanco', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'ODONTOLOGIA', 'blanco', 'FEIDD');
INSERT INTO registro_votos VALUES ('12:04:05', 'ODONTOLOGIA', 'blanco', 'blanco');


UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00069445', 'A00006488', 'A00057127', 'A00042711', 'A00089748');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00089468', 'A00001197', 'A00035340', 'A00095539', 'A00014705');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00098406', 'A00099566', 'A00064211', 'A00058227', 'A00022660');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00094350', 'A00023619', 'A00004793', 'A00037188', 'A00035945');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00095902', 'A00095343', 'A00012889', 'A00009682', 'A00077124');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00030373', 'A00099469', 'A00066514', 'A00031531', 'A00039959');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00081453', 'A00066329', 'A00085514', 'A00041676', 'A00004741');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00089773', 'A00021529', 'A00074577', 'A00074282', 'A00086648');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00070831', 'A00006731', 'A00086390', 'A00053149', 'A00047944' );
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00081302', 'A00028152', 'A00007307', 'A00053811', 'A00097121');
UPDATE estudiantes SET aVotado = 'true' WHERE id in ('A00061526', 'A00014241', 'A00015918', 'A00004634', 'A00082345');

-- FINALIZAR PROCESO DE VOTACIÓN

update estado_proceso set estado = 3;