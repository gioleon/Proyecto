USE sistematickets;

DROP TABLE IF EXISTS persona;

CREATE TABLE persona(
	Id bigint PRIMARY KEY,
    Identificacion varchar(10) NOT NULL,
    Nombre varchar(25) NOT NULL,
    Apellido varchar(25) NOT NULL,
    Correo_institucional varchar(30) NOT NULL,
    Contraseña varchar(255) NOT NULL,
    rol_id smallint,
    
    FOREIGN KEY(rol_id) REFERENCES rol(rol_id),
    UNIQUE (Correo_institucional)
);

select * from persona;

INSERT INTO persona(Id, Contraseña) 
VALUES (2, SHA1("hello"));