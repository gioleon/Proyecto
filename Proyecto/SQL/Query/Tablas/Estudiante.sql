USE sistematickets;

DROP TABLE IF EXISTS Estudiante;

CREATE TABLE Estudiante(
	id_estudiante bigint PRIMARY KEY,
    identificacion varchar(10) NOT NULL UNIQUE,
	nombre varchar(25) NOT NULL,
    apellido varchar(25) NOT NULL,
    correo_institucional varchar(60) NOT NULL,
    contraseña varchar(255) NOT NULL,
    semestre smallint NOT NULL,
    nombre_facultad varchar(100) NOT NULL,
    nombre_programa varchar(100) NOT NULL,
    rol_id smallint,
	
    FOREIGN KEY(rol_id) REFERENCES rol(rol_id),
	FOREIGN KEY(nombre_facultad) REFERENCES facultad(nombre_facultad),
    FOREIGN KEY(nombre_programa) REFERENCES programa(nombre_programa),
    CHECK(Semestre>0 and Semestre <= 10)
);

USE sistematickets;
select * from estudiante;