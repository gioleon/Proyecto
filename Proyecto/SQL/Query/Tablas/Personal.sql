USE sistematickets;

DROP TABLE IF EXISTS personal;

CREATE TABLE personal(
	Id_personal bigint PRIMARY KEY,
    Identificacion varchar(10) UNIQUE,
	Nombre varchar(25) NOT NULL,
    Apellido varchar(25) NOT NULL,
    Correo_institucional varchar(60) NOT NULL,
    Contraseña varchar(255) NOT NULL,
    Facultad varchar(100) NOT NULL,
    Programa varchar(100) NOT NULL,
    rol_id smallint NOT NULL,
    
	FOREIGN KEY(rol_id) REFERENCES rol(rol_id), 
    FOREIGN KEY(Facultad) REFERENCES facultad(Facultad),
    FOREIGN KEY(Programa) REFERENCES programa(Programa)
);
