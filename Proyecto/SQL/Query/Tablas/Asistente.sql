USE sistematickets;

DROP TABLE IF EXISTS asistente;

CREATE TABLE asistente(
	Id_asistente bigint PRIMARY KEY,
    Identificacion varchar(10) UNIQUE,
	Nombre varchar(25) NOT NULL,
    Apellido varchar(25) NOT NULL,
    Correo_institucional varchar(30) NOT NULL,
    Contraseña varchar(255) NOT NULL,
    Facultad varchar(25),
    Programa varchar(25),
    rol_id smallint,
    
	FOREIGN KEY(rol_id) REFERENCES rol(rol_id), 
    FOREIGN KEY(Facultad) REFERENCES facultad(Nombre),
    FOREIGN KEY(Programa) REFERENCES programa(Nombre)
);

select * from asistente;