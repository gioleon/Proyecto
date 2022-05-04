USE sistematickets;

DROP TABLE IF EXISTS asistente;

CREATE TABLE asistente(
	Id_asistente bigint PRIMARY KEY,
    Identificacion varchar(10) UNIQUE,
	Nombre varchar(25) NOT NULL,
    Apellido varchar(25) NOT NULL,
    Correo_institucional varchar(40) NOT NULL,
    Contraseña varchar(255) NOT NULL,
    Facultad varchar(40) NOT NULL,
    Programa varchar(40) NOT NULL,
    rol_id smallint NOT NULL,
    
	FOREIGN KEY(rol_id) REFERENCES rol(rol_id), 
    FOREIGN KEY(Facultad) REFERENCES facultad(Facultad),
    FOREIGN KEY(Programa) REFERENCES programa(Programa)
);

select * from asistente;