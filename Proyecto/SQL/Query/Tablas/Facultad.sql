USE sistematickets;

DROP TABLE IF EXISTS Facultad;

CREATE TABLE Facultad(
	Id_facultad smallint PRIMARY KEY NOT NULL,
    Facultad varchar(40) NOT NULL,
    UNIQUE (Facultad)
);