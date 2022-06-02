USE sistematickets;

DROP TABLE IF EXISTS Programa;

CREATE TABLE Programa(
	id_programa smallint PRIMARY KEY,
    id_facultad smallint NOT NULL,
    nombre_facultad varchar(100) NOT NULL, 
    nombre_programa varchar(100) NOT NULL,
    FOREIGN KEY(Id_facultad) REFERENCES facultad(Id_facultad),
    FOREIGN KEY(nombre_facultad) REFERENCES facultad(nombre_facultad),
    UNIQUE (nombre_programa)
);

