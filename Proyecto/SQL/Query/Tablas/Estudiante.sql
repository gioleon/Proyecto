USE sistematickets;

DROP TABLE IF EXISTS Estudiante;

CREATE TABLE Estudiante(
	Id_estudiante bigint PRIMARY KEY,
    Identificacion varchar(10) NOT NULL UNIQUE,
	Nombre varchar(25) NOT NULL,
    Apellido varchar(25) NOT NULL,
    Correo_institucional varchar(30) NOT NULL,
    Contraseña varchar(255) NOT NULL,
    Semestre smallint NOT NULL,
    Facultad varchar(25) NOT NULL,
    Programa varchar(25) NOT NULL,
    rol_id smallint,
	
    FOREIGN KEY(rol_id) REFERENCES rol(rol_id),
	FOREIGN KEY(Facultad) REFERENCES facultad(Nombre),
    FOREIGN KEY(Programa) REFERENCES programa(Nombre),
    CHECK(Semestre>0 and Semestre <= 10)
);

INSERT INTO estudiante
VALUES ("giovannileon2017", SHA1("contraseña"));

select * from estudiante;

SELECT * FROM estudiante 
WHERE Correo_institucional like "giovannileon2017@gmail.com";

select SHA1("contraseña") encriptado;