-- AGREGACIÓN DE PARTIDOS

INSERT INTO partidos(nombre, presidente, eslogan) VALUES ('APE', 'A00069445', 'Slogan APE');
INSERT INTO partidos(nombre, presidente, eslogan) VALUES ('FEIDD', 'A00030557', 'Slogan FEIDD');
INSERT INTO partidos(nombre, presidente, eslogan) VALUES ('CRE', 'A00053253', 'Slogan CRE');

-- FINALIZAR PROCESO AGREGACIÓN PARTIDOS

update estado_proceso set estado = 1;