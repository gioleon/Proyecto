USE sistematickets;

DROP TABLE IF EXISTS rol;

CREATE TABLE rol(
	rol_id smallint PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(25),
    
    UNIQUE (nombre)
);


INSERT INTO rol (nombre)
values("estudiante");

select * from rol;