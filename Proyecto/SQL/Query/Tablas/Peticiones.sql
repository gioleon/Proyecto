USE sistematickets;

DROP TABLE IF EXISTS Peticion;

CREATE TABLE Peticion(
	id_peticion bigint PRIMARY KEY,
    id_estudiante bigint,
    id_personal bigint DEFAULT 0,
    nombre_facultad varchar(100),
    nombre_programa varchar(100),
    asunto varchar(100) NOT NULL,
    informacion varchar(1000) NOT NULL,
    retroalimentacion varchar(1000) DEFAULT "sin especificación",
    fecha_creacion datetime NOT NULL,
    fecha_inicio datetime DEFAULT "0/0/0000",
	fecha_final datetime DEFAULT "0/0/0000",
    estado varchar(30) default "sin asignar",
    
    FOREIGN KEY (id_estudiante) REFERENCES estudiante(id_estudiante),
    FOREIGN KEY (id_personal) REFERENCES personal(id_personal),
    FOREIGN KEY (nombre_programa) REFERENCES programa(nombre_programa),
    FOREIGN KEY (nombre_facultad) REFERENCES facultad(nombre_facultad)
    );
    
select * from peticion;