USE sistematickets;

DROP TABLE IF EXISTS asistente;

CREATE TABLE asistente(
	Id_asistente bigint PRIMARY KEY,
    Identificacion varchar(10),
    Facultad varchar(25),
    Programa varchar(25),
    
	FOREIGN KEY(Identificacion) REFERENCES persona(Identificacion), 
    FOREIGN KEY(Facultad) REFERENCES facultad(Nombre),
    FOREIGN KEY(Programa) REFERENCES programa(Nombre)
);

