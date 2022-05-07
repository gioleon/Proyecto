USE sistematickets;

DROP TABLE IF EXISTS Facultad;

CREATE TABLE Facultad(
	Id_facultad smallint PRIMARY KEY NOT NULL,
    Facultad varchar(100) NOT NULL,
    UNIQUE (Facultad)
);

select * from facultad;