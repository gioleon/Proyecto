USE sistematickets;

DROP TABLE IF EXISTS Facultad;

CREATE TABLE Facultad(
	Id_facultad int PRIMARY KEY NOT NULL,
    Nombre varchar(25),
    UNIQUE (Nombre)
);