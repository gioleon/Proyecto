USE sistematickets;

DROP TABLE IF EXISTS Programa;

CREATE TABLE Programa(
	Id_programa smallint PRIMARY KEY,
    Id_facultad smallint NOT NULL,
    Facultad varchar(100) NOT NULL, 
    Programa varchar(100) NOT NULL,
    FOREIGN KEY(Id_facultad) REFERENCES Facultad(Id_facultad),
    UNIQUE (Programa)
);

select * from programa;
