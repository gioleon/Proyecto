USE sistematickets;

DROP TABLE IF EXISTS Estudiante;

CREATE TABLE Estudiante(
	Id_estudiante bigint PRIMARY KEY,
    Identificacion varchar(10) UNIQUE,
    Semestre smallint,
    Facultad varchar(25),
    Programa varchar(25),
    Correo_institucional varchar(30),
    Contraseña varchar(25),
	
    FOREIGN KEY(Facultad) REFERENCES facultad(Nombre),
    FOREIGN KEY(Programa) REFERENCES programa(Nombre),
    UNIQUE (Correo_institucional),
    CHECK(Semestre>0 and Semestre <= 10)
);