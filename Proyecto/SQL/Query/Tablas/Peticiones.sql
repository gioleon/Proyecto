USE sistematickets;

DROP TABLE IF EXISTS Peticiones;

CREATE TABLE Peticiones(
	Id_peticion bigint PRIMARY KEY,
    Id_estudiante bigint,
    Id_asistente bigint,
    Facultad varchar(25),
    Programa varchar(25),
    Area_encargada varchar(25) NOT NULL,
    Informacion varchar(500) NOT NULL,
    Fecha_inicio datetime NOT NULL,
	Fecha_final datetime DEFAULT "0/0/0000",
    Estado varchar(15) DEFAULT "Pendiente",
    
    FOREIGN KEY (Id_estudiante) REFERENCES estudiante(Id_estudiante),
    FOREIGN KEY (Id_asistente) REFERENCES asistente(Id_asistente),
	FOREIGN KEY (Facultad) REFERENCES facultad(Nombre),
    FOREIGN KEY (Programa) REFERENCES programa(Nombre)
    );