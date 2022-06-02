USE sistematickets;

DROP TABLE IF EXISTS rol;

CREATE TABLE rol(
	rol_id smallint PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(40),
    
    UNIQUE (nombre)
);


CALL insertRol("estudiante");
CALL insertRol("director de programa");
CALL insertRol("asistente de programa");


USE sistematickets;
select * from rol;

select SHA1("CONTRASEÑA");