USE sistematickets;

DROP TABLE IF EXISTS Facultad;

CREATE TABLE Facultad(
	Id_facultad smallint PRIMARY KEY,
    Facultad varchar(100) NOT NULL UNIQUE
);

select * from facultad;

CALL insertFacultad("ciencias economicas, administrativas y contables");
CALL insertFacultad("ciencias sociales y humanas");
CALL insertFacultad("ingenieria");

select * from facultad;