USE sistematickets;

DROP TABLE IF EXISTS Peticion;

CREATE TABLE Peticion(
	Id_peticion bigint PRIMARY KEY,
    Id_estudiante bigint,
    Id_personal bigint DEFAULT -1,
    Encargado varchar(30) DEFAULT "Sin asignar",
    Facultad varchar(100),
    Programa varchar(100),
    Asunto varchar(25) NOT NULL,
    Informacion varchar(1000) NOT NULL,
    Retroalimentacion varchar(1000) DEFAULT "Sin especificación",
    Fecha_creacion datetime NOT NULL,
    Fecha_inicion datetime DEFAULT "0/0/0000",
	Fecha_final datetime DEFAULT "0/0/0000",
    Estado varchar(15) DEFAULT "Pendiente",
    
    FOREIGN KEY (Id_estudiante) REFERENCES estudiante(Id_estudiante),
    FOREIGN KEY (Id_personal) REFERENCES personal(Id_personal),
    FOREIGN KEY (Programa) REFERENCES programa(Programa)
    );