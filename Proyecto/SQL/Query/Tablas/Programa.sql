USE sistematickets;

DROP TABLE IF EXISTS Programa;

CREATE TABLE Programa(
	Id_programa long PRIMARY KEY,
    Id_facultad long,
    Nombre varchar(25),
    FOREIGN KEY(Id_facultad) REFERENCES Facultad(Id_facultad),
    UNIQUE (Nombre)
);